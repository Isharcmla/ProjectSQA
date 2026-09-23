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

public class Option_setLongOpt_148009938853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;
     Object term6024;

    public Option_setLongOpt_148009938853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term801 = new ArrayList();
        term748 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term800 = newInstance(Class.forName("java.lang.Object"));
        setField(term748, term748.getClass(), "opt", "dWRymuLBtr");
        setField(term748, term748.getClass(), "longOpt", "AijpHYOFuy");
        setField(term748, term748.getClass(), "argName", "SbAoxhfrkn");
        setField(term748, term748.getClass(), "description", "kuTXqwMtDB");
        setBooleanField(term748, term748.getClass(), "required", false);
        setBooleanField(term748, term748.getClass(), "optionalArg", false);
        setIntField(term748, term748.getClass(), "numberOfArgs", -1955890973);
        setField(term748, term748.getClass(), "type", term800);
        setField(term748, term748.getClass(), "values", term801);
        setCharField(term748, term748.getClass(), "valuesep", 'Z');
        ArrayList term6034 = new ArrayList();
        term6024 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6033 = newInstance(Class.forName("java.lang.Object"));
        setField(term6024, term6024.getClass(), "opt", "dWRymuLBtr");
        setField(term6024, term6024.getClass(), "longOpt", "Ghbwtircqb");
        setField(term6024, term6024.getClass(), "argName", "SbAoxhfrkn");
        setField(term6024, term6024.getClass(), "description", "kuTXqwMtDB");
        setBooleanField(term6024, term6024.getClass(), "required", false);
        setBooleanField(term6024, term6024.getClass(), "optionalArg", false);
        setIntField(term6024, term6024.getClass(), "numberOfArgs", -1955890973);
        setField(term6024, term6024.getClass(), "type", term6033);
        setField(term6024, term6024.getClass(), "values", term6034);
        setCharField(term6024, term6024.getClass(), "valuesep", 'Z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setLongOpt", argTypes, term748, args);
        assertTrue(recursiveEquals(term748, term6024));
    }

};


