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

public class CommandLine_getArgList_83874813628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374;
     Object term1325;
     Object term1306;

    public CommandLine_getArgList_83874813628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term375 = new LinkedList();
        HashMap term378 = new HashMap();
        HashMap term383 = new HashMap();
        HashMap term388 = new HashMap();
        term374 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term374, term374.getClass(), "args", term375);
        setField(term374, term374.getClass(), "options", term378);
        setField(term374, term374.getClass(), "names", term383);
        setField(term374, term374.getClass(), "hashcodeMap", term388);
        LinkedList term1326 = new LinkedList();
        HashMap term1327 = new HashMap();
        HashMap term1328 = new HashMap();
        HashMap term1329 = new HashMap();
        term1325 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1325, term1325.getClass(), "args", term1326);
        setField(term1325, term1325.getClass(), "options", term1327);
        setField(term1325, term1325.getClass(), "names", term1328);
        setField(term1325, term1325.getClass(), "hashcodeMap", term1329);
        term1306 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.CommandLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgList", argTypes, term374, args);
        assertTrue(recursiveEquals(term374, term1325));
        assertTrue(recursiveEquals(retValue, term1306));
    }

};


