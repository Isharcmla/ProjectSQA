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
import java.util.HashMap;
import java.lang.Object;

public class Options_getOption_1809050762261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87877;
     Object term88241;

    public Options_getOption_1809050762261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term87743 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term87743, 0, term87743);
        HashMap term87925 = new HashMap();
        ((HashMap) term87925).put((Object)term87743, (Object)term87743);
        HashMap term88077 = new HashMap();
        ((HashMap) term88077).put((Object)null, (Object)null);
        term87877 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term87877, term87877.getClass(), "shortOpts", term87925);
        setField(term87877, term87877.getClass(), "longOpts", term88077);
        HashMap term88242 = new HashMap();
        HashMap term88247 = new HashMap();
        term88241 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term88241, term88241.getClass(), "shortOpts", term88242);
        setField(term88241, term88241.getClass(), "longOpts", term88247);
        setField(term88241, term88241.getClass(), "requiredOpts", null);
        setField(term88241, term88241.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getOption", argTypes, term87877, args);
        assertTrue(recursiveEquals(term87877, term88241));
        assertTrue(recursiveEquals(retValue, null));
    }

};


