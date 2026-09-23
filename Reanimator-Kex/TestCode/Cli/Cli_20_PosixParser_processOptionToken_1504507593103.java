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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class PosixParser_processOptionToken_1504507593103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48856;

    public PosixParser_processOptionToken_1504507593103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term48970 = new HashMap();
        HashMap term49122 = new HashMap();
        ((HashMap) term49122).put("", "");
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        ((HashMap) term49122).put((Object)null, (Object)null);
        term48856 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term48922 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term48922, term48922.getClass(), "shortOpts", term48970);
        setField(term48922, term48922.getClass(), "longOpts", term49122);
        setField(term48856, term48856.getClass(), "options", term48922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term48856, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


