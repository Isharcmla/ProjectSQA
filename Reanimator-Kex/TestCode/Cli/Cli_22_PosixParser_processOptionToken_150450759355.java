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

public class PosixParser_processOptionToken_150450759355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15602;
     Object term16028;

    public PosixParser_processOptionToken_150450759355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15844 = newInstance(Class.forName("java.lang.Object"));
        HashMap term15716 = new HashMap();
        ((HashMap) term15716).put("", "");
        ((HashMap) term15716).put(term15844, term15844);
        Object term15934 = newInstance(Class.forName("java.lang.Object"));
        Object term15972 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term15896 = new ArrayList();
        ((ArrayList) term15896).add(term15934);
        ((ArrayList) term15896).add(term15972);
        term15602 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term15668 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term15668, term15668.getClass(), "shortOpts", term15716);
        setField(term15602, term15602.getClass(), "options", term15668);
        setField(term15602, term15602.getClass(), "tokens", term15896);
        Object term16031 = newInstance(Class.forName("java.lang.Object"));
        Object term16032 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term16029 = new ArrayList();
        ((ArrayList) term16029).add(term16031);
        ((ArrayList) term16029).add(term16032);
        ((ArrayList) term16029).add("");
        term16028 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16028, term16028.getClass(), "tokens", term16029);
        setBooleanField(term16028, term16028.getClass(), "eatTheRest", false);
        setField(term16028, term16028.getClass(), "options", null);
        setField(term16028, term16028.getClass(), "cmd", null);
        setField(term16028, term16028.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        callMethod(klass, "processOptionToken", argTypes, term15602, args);
        assertTrue(recursiveEquals(term15602, term16028));
    }

};


