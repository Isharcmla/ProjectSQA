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
import java.lang.Object;
import java.util.ArrayList;

public class Option_hasOptionalArg_90913760655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968;
     Object term6408;

    public Option_hasOptionalArg_90913760655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1021 = new ArrayList();
        term968 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1020 = newInstance(Class.forName("java.lang.Object"));
        setField(term968, term968.getClass(), "opt", "wSQxaModmm");
        setField(term968, term968.getClass(), "longOpt", "UlajhuVLaP");
        setField(term968, term968.getClass(), "argName", "gGSMzuGICf");
        setField(term968, term968.getClass(), "description", "hxCBltsObl");
        setBooleanField(term968, term968.getClass(), "required", false);
        setBooleanField(term968, term968.getClass(), "optionalArg", true);
        setIntField(term968, term968.getClass(), "numberOfArgs", 1227103734);
        setField(term968, term968.getClass(), "type", term1020);
        setField(term968, term968.getClass(), "values", term1021);
        setCharField(term968, term968.getClass(), "valuesep", 'T');
        ArrayList term6418 = new ArrayList();
        term6408 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6417 = newInstance(Class.forName("java.lang.Object"));
        setField(term6408, term6408.getClass(), "opt", "wSQxaModmm");
        setField(term6408, term6408.getClass(), "longOpt", "UlajhuVLaP");
        setField(term6408, term6408.getClass(), "argName", "gGSMzuGICf");
        setField(term6408, term6408.getClass(), "description", "hxCBltsObl");
        setBooleanField(term6408, term6408.getClass(), "required", false);
        setBooleanField(term6408, term6408.getClass(), "optionalArg", true);
        setIntField(term6408, term6408.getClass(), "numberOfArgs", 1227103734);
        setField(term6408, term6408.getClass(), "type", term6417);
        setField(term6408, term6408.getClass(), "values", term6418);
        setCharField(term6408, term6408.getClass(), "valuesep", 'T');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasOptionalArg", argTypes, term968, args);
        assertTrue(recursiveEquals(term968, term6408));
    }

};


