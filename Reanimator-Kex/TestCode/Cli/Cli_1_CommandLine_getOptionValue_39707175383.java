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

public class CommandLine_getOptionValue_39707175383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21312;
     Object term22404;

    public CommandLine_getOptionValue_39707175383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21360 = new HashMap();
        ((HashMap) term21360).put((Object)null, (Object)null);
        ((HashMap) term21360).put("                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                ");
        HashMap term21588 = new HashMap();
        term21312 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term21312, term21312.getClass(), "names", term21360);
        setField(term21312, term21312.getClass(), "options", term21588);
        HashMap term22405 = new HashMap();
        HashMap term22406 = new HashMap();
        term22404 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term22404, term22404.getClass(), "args", null);
        setField(term22404, term22404.getClass(), "options", term22405);
        setField(term22404, term22404.getClass(), "names", term22406);
        setField(term22404, term22404.getClass(), "hashcodeMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                ";
        args[1] = null;
        Object retValue = callMethod(klass, "getOptionValue", argTypes, term21312, args);
        assertTrue(recursiveEquals(term21312, term22404));
        assertTrue(recursiveEquals(retValue, null));
    }

};
