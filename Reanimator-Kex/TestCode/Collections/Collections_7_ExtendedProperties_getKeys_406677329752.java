package org.apache.commons.collections;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_getKeys_406677329752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2161389;

    public ExtendedProperties_getKeys_406677329752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2161493 = new ArrayList();
        ArrayList term2161545 = new ArrayList();
        ArrayList term2161597 = new ArrayList();
        ArrayList term2161441 = new ArrayList();
        ((ArrayList) term2161441).add(term2161493);
        ((ArrayList) term2161441).add(term2161545);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add(term2161597);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add("");
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        ((ArrayList) term2161441).add((Object)null);
        term2161389 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term2161389, term2161389.getClass(), "keysAsListed", term2161441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getKeys", argTypes, term2161389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


