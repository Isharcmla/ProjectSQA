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

public class CommandLine_iterator_62611975232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;
     Object term1587;
     Object term1564;

    public CommandLine_iterator_62611975232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term553 = new LinkedList();
        HashMap term556 = new HashMap();
        HashMap term561 = new HashMap();
        HashMap term566 = new HashMap();
        term552 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term552, term552.getClass(), "args", term553);
        setField(term552, term552.getClass(), "options", term556);
        setField(term552, term552.getClass(), "names", term561);
        setField(term552, term552.getClass(), "hashcodeMap", term566);
        LinkedList term1588 = new LinkedList();
        HashMap term1589 = new HashMap();
        HashMap term1590 = new HashMap();
        HashMap term1591 = new HashMap();
        term1587 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1587, term1587.getClass(), "args", term1588);
        setField(term1587, term1587.getClass(), "options", term1589);
        setField(term1587, term1587.getClass(), "names", term1590);
        setField(term1587, term1587.getClass(), "hashcodeMap", term1591);
        HashMap term1565 = new HashMap();
        term1564 = newInstance(Class.forName("java.util.HashMap$ValueIterator"));
        setField(term1564, term1564.getClass(), "this$0", term1565);
        setField(term1564, term1564.getClass(), "next", null);
        setField(term1564, term1564.getClass(), "current", null);
        setIntField(term1564, term1564.getClass(), "expectedModCount", 0);
        setIntField(term1564, term1564.getClass(), "index", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "iterator", argTypes, term552, args);
        assertTrue(recursiveEquals(term552, term1587));
        assertTrue(recursiveEquals(retValue, term1564));
    }

};


