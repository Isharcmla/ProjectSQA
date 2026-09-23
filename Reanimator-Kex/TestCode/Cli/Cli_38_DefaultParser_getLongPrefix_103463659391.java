package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DefaultParser_getLongPrefix_103463659391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543347;
     Object term832264;

    public DefaultParser_getLongPrefix_103463659391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term543601 = newInstance(Class.forName("java.lang.Object"));
        Object term543639 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term543473 = new LinkedHashMap();
        ((LinkedHashMap) term543473).put("", "");
        ((LinkedHashMap) term543473).put(term543601, term543601);
        ((LinkedHashMap) term543473).put(term543639, term543639);
        ((LinkedHashMap) term543473).put((Object)null, (Object)null);
        ((LinkedHashMap) term543473).put((Object)null, (Object)null);
        ((LinkedHashMap) term543473).put((Object)null, (Object)null);
        term543347 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term543413 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term543413, term543413.getClass(), "longOpts", term543473);
        setField(term543347, term543347.getClass(), "options", term543413);
        LinkedHashMap term832266 = new LinkedHashMap();
        term832264 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term832265 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term832264, term832264.getClass(), "cmd", null);
        setField(term832265, term832265.getClass(), "shortOpts", null);
        setField(term832265, term832265.getClass(), "longOpts", term832266);
        setField(term832265, term832265.getClass(), "requiredOpts", null);
        setField(term832265, term832265.getClass(), "optionGroups", null);
        setField(term832264, term832264.getClass(), "options", term832265);
        setBooleanField(term832264, term832264.getClass(), "stopAtNonOption", false);
        setField(term832264, term832264.getClass(), "currentToken", null);
        setField(term832264, term832264.getClass(), "currentOption", null);
        setBooleanField(term832264, term832264.getClass(), "skipParsing", false);
        setField(term832264, term832264.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " \b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term543347, args);
        assertTrue(recursiveEquals(term543347, term832264));
        assertTrue(recursiveEquals(retValue, null));
    }

};


