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

public class CommandLine_getOptions_38840034195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27323;
     Object term27523;
     Object term27515;

    public CommandLine_getOptions_38840034195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27371 = new HashMap();
        term27323 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term27323, term27323.getClass(), "options", term27371);
        HashMap term27524 = new HashMap();
        term27523 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term27523, term27523.getClass(), "args", null);
        setField(term27523, term27523.getClass(), "options", term27524);
        setField(term27523, term27523.getClass(), "names", null);
        setField(term27523, term27523.getClass(), "hashcodeMap", null);
        term27515 = (Object[]) newArray("org.apache.commons.cli.Option", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term27323, args);
        assertTrue(recursiveEquals(term27323, term27523));
        assertTrue(recursiveEquals(retValue, term27515));
    }

};
