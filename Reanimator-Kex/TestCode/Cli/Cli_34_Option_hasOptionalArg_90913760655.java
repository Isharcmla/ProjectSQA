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
import java.util.ArrayList;

public class Option_hasOptionalArg_90913760655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term6258;

    public Option_hasOptionalArg_90913760655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1011 = new ArrayList();
        term959 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term959, term959.getClass(), "opt", "wSQxaModmm");
        setField(term959, term959.getClass(), "longOpt", "UlajhuVLaP");
        setField(term959, term959.getClass(), "argName", "gGSMzuGICf");
        setField(term959, term959.getClass(), "description", "hxCBltsObl");
        setBooleanField(term959, term959.getClass(), "required", false);
        setBooleanField(term959, term959.getClass(), "optionalArg", true);
        setIntField(term959, term959.getClass(), "numberOfArgs", 1227103734);
        setField(term959, term959.getClass(), "type", null);
        setField(term959, term959.getClass(), "values", term1011);
        setCharField(term959, term959.getClass(), "valuesep", 'T');
        ArrayList term6267 = new ArrayList();
        term6258 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6258, term6258.getClass(), "opt", "wSQxaModmm");
        setField(term6258, term6258.getClass(), "longOpt", "UlajhuVLaP");
        setField(term6258, term6258.getClass(), "argName", "gGSMzuGICf");
        setField(term6258, term6258.getClass(), "description", "hxCBltsObl");
        setBooleanField(term6258, term6258.getClass(), "required", false);
        setBooleanField(term6258, term6258.getClass(), "optionalArg", true);
        setIntField(term6258, term6258.getClass(), "numberOfArgs", 1227103734);
        setField(term6258, term6258.getClass(), "type", null);
        setField(term6258, term6258.getClass(), "values", term6267);
        setCharField(term6258, term6258.getClass(), "valuesep", 'T');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasOptionalArg", argTypes, term959, args);
        assertTrue(recursiveEquals(term959, term6258));
    }

};


