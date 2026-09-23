package org.apache.commons.lang3.reflect;

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
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;

public class TypeUtils_typesSatisfyVariables_121097242868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4146;

    public TypeUtils_typesSatisfyVariables_121097242868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4236 = newInstance(Class.forName("java.lang.Object"));
        Object term4274 = newInstance(Class.forName("java.lang.Object"));
        term4146 = new LinkedHashMap();
        ((LinkedHashMap) term4146).put((Object)null, (Object)null);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4236, term4236);
        ((LinkedHashMap) term4146).put(term4274, term4274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4146;
        try {
            callMethod(klass, "typesSatisfyVariables", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


