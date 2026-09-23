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

public class PosixParser_processOptionToken_1504507593101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47968;
     Object term48536;

    public PosixParser_processOptionToken_1504507593101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48082 = new HashMap();
        Object term48324 = newInstance(Class.forName("java.lang.Object"));
        Object term48362 = newInstance(Class.forName("java.lang.Object"));
        HashMap term48234 = new HashMap();
        ((HashMap) term48234).put(term48324, term48324);
        ((HashMap) term48234).put(term48362, term48362);
        ArrayList term48504 = new ArrayList();
        term47968 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term48034 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term48034, term48034.getClass(), "shortOpts", term48082);
        setField(term48034, term48034.getClass(), "longOpts", term48234);
        setField(term47968, term47968.getClass(), "options", term48034);
        setBooleanField(term47968, term47968.getClass(), "eatTheRest", false);
        setField(term47968, term47968.getClass(), "tokens", term48504);
        ArrayList term48537 = new ArrayList();
        ((ArrayList) term48537).add((Object)null);
        term48536 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term48536, term48536.getClass(), "tokens", term48537);
        setBooleanField(term48536, term48536.getClass(), "eatTheRest", true);
        setField(term48536, term48536.getClass(), "currentOption", null);
        setField(term48536, term48536.getClass(), "options", null);
        setField(term48536, term48536.getClass(), "cmd", null);
        setField(term48536, term48536.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term47968, args);
        assertTrue(recursiveEquals(term47968, term48536));
    }

};


