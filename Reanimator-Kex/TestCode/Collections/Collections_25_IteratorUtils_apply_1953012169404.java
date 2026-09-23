package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Set;

public class IteratorUtils_apply_1953012169404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62989;
     Object term63259;

    public IteratorUtils_apply_1953012169404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term63049 = new LinkedHashMap();
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        ((LinkedHashMap) term63049).put((Object)null, (Object)null);
        Set<Object> term62989_OuterSet = ((LinkedHashMap) term63049).keySet();
        term62989 = ((Set) term62989_OuterSet).iterator();
        term63259 = newInstance(Class.forName("org.apache.commons.collections4.functors.IfClosure"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term62989;
        args[1] = term63259;
        try {
            callMethod(klass, "apply", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


