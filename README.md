# sdr-mixins

The Spring Data Repository "mixins" project provides users with a way to make more granular repositories to use with Spring Data. Normally a user could implement the <code>CrudRepository</code>. However, this approach exposes methods like <code>deleteAll()</code> to the rest of the application. 

With the various interfaces users can control which methods are exposed by their repository interface, thus insuring that methods that should not be invoked are never available to be called in the first place.

**NOTE:** In the end this really is just a preference for me that I really like. I made this available on the off chance that others like it as well. I've personally found ````spring-data```` and all of its accompanying modules to be fantastic libraries that help me be very productive.

# Installation

Coming soon! As soon as I have all of the necessary pieces in place to deploy to maven central I'll update this.

# Usage

Suppose that you only want to expose the ability to find an entity by its id and to test for existence of an entity by its id. You would just do the following:

    public interface MyNewRepository<MyEntity, Long> extends
        HasFindById<MyEntity, Long>,
        HasExistsById<MyEntity, Long>,
        Repository<MyEntity, Long> {
    }
