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
     Object term3460;
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
        LinkedHashMap term3461 = new LinkedHashMap();
        LinkedHashMap term3463 = new LinkedHashMap();
        ArrayList term3464 = new ArrayList();
        HashMap term3466 = new HashMap();
        term3460 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3460, term3460.getClass(), "shortOpts", term3461);
        setField(term3460, term3460.getClass(), "longOpts", term3463);
        setField(term3460, term3460.getClass(), "requiredOpts", term3464);
        setField(term3460, term3460.getClass(), "optionGroups", term3466);
        term3404 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "helpOptions", argTypes, term549, args);
        assertTrue(recursiveEquals(term549, term3460));
        assertTrue(recursiveEquals(retValue, term3404));
    }

};


