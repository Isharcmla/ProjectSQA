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

public class CommandLine_getOptionValues_196330445373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16979;
     Object term17341;

    public CommandLine_getOptionValues_196330445373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term16819 = (Object[]) newArray("java.lang.Object", 78);
        setElement(term16819, 1, term16819);
        setElement(term16819, 4, "");
        setElement(term16819, 16, "");
        HashMap term17027 = new HashMap();
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)term16819, (Object)term16819);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put("", "");
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put("", "");
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        ((HashMap) term17027).put((Object)null, (Object)null);
        HashMap term17293 = new HashMap();
        term16979 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term16979, term16979.getClass(), "names", term17027);
        setField(term16979, term16979.getClass(), "options", term17293);
        HashMap term17342 = new HashMap();
        HashMap term17343 = new HashMap();
        term17341 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term17341, term17341.getClass(), "args", null);
        setField(term17341, term17341.getClass(), "options", term17342);
        setField(term17341, term17341.getClass(), "names", term17343);
        setField(term17341, term17341.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getOptionValues", argTypes, term16979, args);
        assertTrue(recursiveEquals(term16979, term17341));
        assertTrue(recursiveEquals(retValue, null));
    }

};
