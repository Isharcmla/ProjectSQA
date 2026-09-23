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
import java.lang.Integer;

public class Option_getValue_49622012875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3044;
     Object term3102;
     Object term10195;

    public Option_getValue_49622012875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3097 = new ArrayList();
        term3044 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3096 = newInstance(Class.forName("java.lang.Object"));
        setField(term3044, term3044.getClass(), "opt", "lHfTrWKMPk");
        setField(term3044, term3044.getClass(), "longOpt", "JDaAnsVTGV");
        setField(term3044, term3044.getClass(), "argName", "mLUZFTfjle");
        setField(term3044, term3044.getClass(), "description", "xIeFjkHkOe");
        setBooleanField(term3044, term3044.getClass(), "required", false);
        setBooleanField(term3044, term3044.getClass(), "optionalArg", false);
        setIntField(term3044, term3044.getClass(), "numberOfArgs", -244121226);
        setField(term3044, term3044.getClass(), "type", term3096);
        setField(term3044, term3044.getClass(), "values", term3097);
        setCharField(term3044, term3044.getClass(), "valuesep", 'z');
        term3102 = new Integer(-203030934);
        ArrayList term10205 = new ArrayList();
        term10195 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10204 = newInstance(Class.forName("java.lang.Object"));
        setField(term10195, term10195.getClass(), "opt", "lHfTrWKMPk");
        setField(term10195, term10195.getClass(), "longOpt", "JDaAnsVTGV");
        setField(term10195, term10195.getClass(), "argName", "mLUZFTfjle");
        setField(term10195, term10195.getClass(), "description", "xIeFjkHkOe");
        setBooleanField(term10195, term10195.getClass(), "required", false);
        setBooleanField(term10195, term10195.getClass(), "optionalArg", false);
        setIntField(term10195, term10195.getClass(), "numberOfArgs", -244121226);
        setField(term10195, term10195.getClass(), "type", term10204);
        setField(term10195, term10195.getClass(), "values", term10205);
        setCharField(term10195, term10195.getClass(), "valuesep", 'z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3102;
        Object retValue = callMethod(klass, "getValue", argTypes, term3044, args);
        assertTrue(recursiveEquals(term3044, term10195));
        assertTrue(recursiveEquals(term3102, -203030934));
        assertTrue(recursiveEquals(retValue, null));
    }

};


