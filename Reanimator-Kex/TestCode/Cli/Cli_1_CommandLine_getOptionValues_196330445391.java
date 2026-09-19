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

public class CommandLine_getOptionValues_196330445391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26869;
     Object term27231;

    public CommandLine_getOptionValues_196330445391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term26709 = (Object[]) newArray("java.lang.Object", 78);
        setElement(term26709, 1, term26709);
        setElement(term26709, 4, "");
        setElement(term26709, 16, "");
        HashMap term26917 = new HashMap();
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)term26709, (Object)term26709);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put("", "");
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put("", "");
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        ((HashMap) term26917).put((Object)null, (Object)null);
        HashMap term27183 = new HashMap();
        term26869 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term26869, term26869.getClass(), "names", term26917);
        setField(term26869, term26869.getClass(), "options", term27183);
        HashMap term27232 = new HashMap();
        HashMap term27233 = new HashMap();
        term27231 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term27231, term27231.getClass(), "args", null);
        setField(term27231, term27231.getClass(), "options", term27232);
        setField(term27231, term27231.getClass(), "names", term27233);
        setField(term27231, term27231.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getOptionValues", argTypes, term26869, args);
        assertTrue(recursiveEquals(term26869, term27231));
        assertTrue(recursiveEquals(retValue, null));
    }

};


