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
     Object term353891;
     Object term354536;

    public DefaultParser_getLongPrefix_103463659391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term354107 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term354017 = new LinkedHashMap();
        ((LinkedHashMap) term354017).put((Object)null, (Object)null);
        ((LinkedHashMap) term354017).put((Object)null, (Object)null);
        ((LinkedHashMap) term354017).put(term354107, term354107);
        ((LinkedHashMap) term354017).put((Object)null, (Object)null);
        ((LinkedHashMap) term354017).put("", "");
        ((LinkedHashMap) term354017).put((Object)null, (Object)null);
        term353891 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term353957 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term353957, term353957.getClass(), "longOpts", term354017);
        setField(term353891, term353891.getClass(), "options", term353957);
        LinkedHashMap term354538 = new LinkedHashMap();
        term354536 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term354537 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term354536, term354536.getClass(), "cmd", null);
        setField(term354537, term354537.getClass(), "shortOpts", null);
        setField(term354537, term354537.getClass(), "longOpts", term354538);
        setField(term354537, term354537.getClass(), "requiredOpts", null);
        setField(term354537, term354537.getClass(), "optionGroups", null);
        setField(term354536, term354536.getClass(), "options", term354537);
        setBooleanField(term354536, term354536.getClass(), "stopAtNonOption", false);
        setField(term354536, term354536.getClass(), "currentToken", null);
        setField(term354536, term354536.getClass(), "currentOption", null);
        setBooleanField(term354536, term354536.getClass(), "skipParsing", false);
        setField(term354536, term354536.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "          ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term353891, args);
        assertTrue(recursiveEquals(term353891, term354536));
        assertTrue(recursiveEquals(retValue, null));
    }

};


