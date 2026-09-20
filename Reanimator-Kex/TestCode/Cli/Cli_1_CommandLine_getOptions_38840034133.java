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
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.Object;

public class CommandLine_getOptions_38840034133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term1613;
     Object term1592;

    public CommandLine_getOptions_38840034133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term572 = new LinkedList();
        HashMap term575 = new HashMap();
        HashMap term580 = new HashMap();
        HashMap term585 = new HashMap();
        term571 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term571, term571.getClass(), "args", term572);
        setField(term571, term571.getClass(), "options", term575);
        setField(term571, term571.getClass(), "names", term580);
        setField(term571, term571.getClass(), "hashcodeMap", term585);
        LinkedList term1614 = new LinkedList();
        HashMap term1615 = new HashMap();
        HashMap term1617 = new HashMap();
        HashMap term1618 = new HashMap();
        term1613 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1613, term1613.getClass(), "args", term1614);
        setField(term1613, term1613.getClass(), "options", term1615);
        setField(term1613, term1613.getClass(), "names", term1617);
        setField(term1613, term1613.getClass(), "hashcodeMap", term1618);
        term1592 = (Object[]) newArray("org.apache.commons.cli.Option", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptions", argTypes, term571, args);
        assertTrue(recursiveEquals(term571, term1613));
        assertTrue(recursiveEquals(retValue, term1592));
    }

};
