module net.haruyuzuriha.seiroku.core {
    requires transitive net.haruyuzuriha.seiroku.api;
    requires org.mybatis;
    requires org.aspectj.weaver;

    // Only the top-level package is exported, and only to the frameworks that
    // need to instantiate/wire our service implementations at runtime.
    exports net.haruyuzuriha.seiroku.core to spring.beans, spring.context;

    // MyBatis needs reflective access to map result rows onto these classes.
    // Nothing else may reach into this package.
    opens net.haruyuzuriha.seiroku.core.persistence to org.mybatis;

    // account, transaction, ledger, aspect packages stay completely sealed:
    // no exports, no opens. Invisible outside this module, including to
    // Class.forName() and friends.
}
