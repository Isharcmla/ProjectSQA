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

public class Options_helpOptions_22142424825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549;
     Object term3431;
     Object term3404;

    public Options_helpOptions_22142424825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term550 = new LinkedHashMap();
        LinkedHashMap term556 = new LinkedHashMap();
        ArrayList term562 = new ArrayList();
        HashMap term566 = new HashMap();
        term549 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term549, term549.getClass(), "shortOpts", term550);
        setField(term549, term549.getClass(), "longOpts", term556);
        setField(term549, term549.getClass(), "requiredOpts", term562);
        setField(term549, term549.getClass(), "optionGroups", term566);
        LinkedHashMap term3432 = new LinkedHashMap();
        LinkedHashMap term3434 = new LinkedHashMap();
        ArrayList term3435 = new ArrayList();
        HashMap term3437 = new HashMap();
        term3431 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3431, term3431.getClass(), "shortOpts", term3432);
        setField(term3431, term3431.getClass(), "longOpts", term3434);
        setField(term3431, term3431.getClass(), "requiredOpts", term3435);
        setField(term3431, term3431.getClass(), "optionGroups", term3437);
        term3404 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "helpOptions", argTypes, term549, args);
        assertTrue(recursiveEquals(term549, term3431));
        assertTrue(recursiveEquals(retValue, term3404));
    }

};


