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

public class PosixParser_processOptionToken_150450759369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19779;
     Object term20339;

    public PosixParser_processOptionToken_150450759369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19893 = new HashMap();
        Object term20173 = newInstance(Class.forName("java.lang.Object"));
        HashMap term20045 = new HashMap();
        ((HashMap) term20045).put("", "");
        ((HashMap) term20045).put(term20173, term20173);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ((HashMap) term20045).put((Object)null, (Object)null);
        ArrayList term20277 = new ArrayList();
        term19779 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term19845 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19845, term19845.getClass(), "shortOpts", term19893);
        setField(term19845, term19845.getClass(), "longOpts", term20045);
        setField(term19779, term19779.getClass(), "options", term19845);
        setField(term19779, term19779.getClass(), "tokens", term20277);
        ArrayList term20340 = new ArrayList();
        ((ArrayList) term20340).add("");
        term20339 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term20339, term20339.getClass(), "tokens", term20340);
        setBooleanField(term20339, term20339.getClass(), "eatTheRest", false);
        setField(term20339, term20339.getClass(), "options", null);
        setField(term20339, term20339.getClass(), "cmd", null);
        setField(term20339, term20339.getClass(), "requiredOptions", null);
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
        callMethod(klass, "processOptionToken", argTypes, term19779, args);
        assertTrue(recursiveEquals(term19779, term20339));
    }

};


