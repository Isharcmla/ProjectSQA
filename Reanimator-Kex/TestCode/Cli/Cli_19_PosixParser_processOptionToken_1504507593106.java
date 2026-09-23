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
import java.util.HashMap;
import java.util.ArrayList;

public class PosixParser_processOptionToken_1504507593106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49466;
     Object term50034;

    public PosixParser_processOptionToken_1504507593106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term49580 = new HashMap();
        Object term49822 = newInstance(Class.forName("java.lang.Object"));
        Object term49860 = newInstance(Class.forName("java.lang.Object"));
        HashMap term49732 = new HashMap();
        ((HashMap) term49732).put(term49822, term49822);
        ((HashMap) term49732).put(term49860, term49860);
        ArrayList term50002 = new ArrayList();
        term49466 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term49532 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term49532, term49532.getClass(), "shortOpts", term49580);
        setField(term49532, term49532.getClass(), "longOpts", term49732);
        setField(term49466, term49466.getClass(), "options", term49532);
        setBooleanField(term49466, term49466.getClass(), "eatTheRest", false);
        setField(term49466, term49466.getClass(), "tokens", term50002);
        ArrayList term50035 = new ArrayList();
        ((ArrayList) term50035).add((Object)null);
        term50034 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term50034, term50034.getClass(), "tokens", term50035);
        setBooleanField(term50034, term50034.getClass(), "eatTheRest", true);
        setField(term50034, term50034.getClass(), "currentOption", null);
        setField(term50034, term50034.getClass(), "options", null);
        setField(term50034, term50034.getClass(), "cmd", null);
        setField(term50034, term50034.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        callMethod(klass, "processOptionToken", argTypes, term49466, args);
        assertTrue(recursiveEquals(term49466, term50034));
    }

};


