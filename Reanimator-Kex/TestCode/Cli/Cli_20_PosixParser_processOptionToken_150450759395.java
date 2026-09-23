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

public class PosixParser_processOptionToken_150450759395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45851;
     Object term46303;

    public PosixParser_processOptionToken_150450759395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45965 = new HashMap();
        Object[] term45716 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term46117 = new HashMap();
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ((HashMap) term46117).put((Object)term45716, (Object)term45716);
        ArrayList term46273 = new ArrayList();
        term45851 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term45917 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term45917, term45917.getClass(), "shortOpts", term45965);
        setField(term45917, term45917.getClass(), "longOpts", term46117);
        setField(term45851, term45851.getClass(), "options", term45917);
        setField(term45851, term45851.getClass(), "tokens", term46273);
        ArrayList term46304 = new ArrayList();
        ((ArrayList) term46304).add((Object)null);
        term46303 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term46303, term46303.getClass(), "tokens", term46304);
        setBooleanField(term46303, term46303.getClass(), "eatTheRest", false);
        setField(term46303, term46303.getClass(), "currentOption", null);
        setField(term46303, term46303.getClass(), "options", null);
        setField(term46303, term46303.getClass(), "cmd", null);
        setField(term46303, term46303.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        callMethod(klass, "processOptionToken", argTypes, term45851, args);
        assertTrue(recursiveEquals(term45851, term46303));
    }

};


