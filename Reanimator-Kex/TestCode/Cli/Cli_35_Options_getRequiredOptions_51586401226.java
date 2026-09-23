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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Options_getRequiredOptions_51586401226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term3454;
     Object term3431;

    public Options_getRequiredOptions_51586401226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term572 = new LinkedHashMap();
        LinkedHashMap term578 = new LinkedHashMap();
        ArrayList term584 = new ArrayList();
        HashMap term588 = new HashMap();
        term571 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term571, term571.getClass(), "shortOpts", term572);
        setField(term571, term571.getClass(), "longOpts", term578);
        setField(term571, term571.getClass(), "requiredOpts", term584);
        setField(term571, term571.getClass(), "optionGroups", term588);
        LinkedHashMap term3455 = new LinkedHashMap();
        LinkedHashMap term3456 = new LinkedHashMap();
        ArrayList term3457 = new ArrayList();
        HashMap term3459 = new HashMap();
        term3454 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3454, term3454.getClass(), "shortOpts", term3455);
        setField(term3454, term3454.getClass(), "longOpts", term3456);
        setField(term3454, term3454.getClass(), "requiredOpts", term3457);
        setField(term3454, term3454.getClass(), "optionGroups", term3459);
        ArrayList term3432 = new ArrayList();
        term3431 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term3431, term3431.getClass(), "list", term3432);
        setField(term3431, term3431.getClass(), "c", term3432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRequiredOptions", argTypes, term571, args);
        assertTrue(recursiveEquals(term571, term3454));
        assertTrue(recursiveEquals(retValue, term3431));
    }

};


