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
import java.util.ArrayList;

public class Option_getValue_49621820674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2946;
     Object term10042;

    public Option_getValue_49621820674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2999 = new ArrayList();
        term2946 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2998 = newInstance(Class.forName("java.lang.Object"));
        setField(term2946, term2946.getClass(), "opt", "hCWPJQKpdc");
        setField(term2946, term2946.getClass(), "longOpt", "WzMEhMXkKx");
        setField(term2946, term2946.getClass(), "argName", "XOiDvlDhdc");
        setField(term2946, term2946.getClass(), "description", "AdxvLJhNLe");
        setBooleanField(term2946, term2946.getClass(), "required", false);
        setBooleanField(term2946, term2946.getClass(), "optionalArg", false);
        setIntField(term2946, term2946.getClass(), "numberOfArgs", -1275173084);
        setField(term2946, term2946.getClass(), "type", term2998);
        setField(term2946, term2946.getClass(), "values", term2999);
        setCharField(term2946, term2946.getClass(), "valuesep", 'q');
        ArrayList term10052 = new ArrayList();
        term10042 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10051 = newInstance(Class.forName("java.lang.Object"));
        setField(term10042, term10042.getClass(), "opt", "hCWPJQKpdc");
        setField(term10042, term10042.getClass(), "longOpt", "WzMEhMXkKx");
        setField(term10042, term10042.getClass(), "argName", "XOiDvlDhdc");
        setField(term10042, term10042.getClass(), "description", "AdxvLJhNLe");
        setBooleanField(term10042, term10042.getClass(), "required", false);
        setBooleanField(term10042, term10042.getClass(), "optionalArg", false);
        setIntField(term10042, term10042.getClass(), "numberOfArgs", -1275173084);
        setField(term10042, term10042.getClass(), "type", term10051);
        setField(term10042, term10042.getClass(), "values", term10052);
        setCharField(term10042, term10042.getClass(), "valuesep", 'q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term2946, args);
        assertTrue(recursiveEquals(term2946, term10042));
        assertTrue(recursiveEquals(retValue, null));
    }

};


