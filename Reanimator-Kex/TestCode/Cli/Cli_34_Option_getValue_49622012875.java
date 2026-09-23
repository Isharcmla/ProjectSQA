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
import java.lang.Integer;

public class Option_getValue_49622012875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3015;
     Object term3072;
     Object term10071;

    public Option_getValue_49622012875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3067 = new ArrayList();
        term3015 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3015, term3015.getClass(), "opt", "lHfTrWKMPk");
        setField(term3015, term3015.getClass(), "longOpt", "JDaAnsVTGV");
        setField(term3015, term3015.getClass(), "argName", "mLUZFTfjle");
        setField(term3015, term3015.getClass(), "description", "xIeFjkHkOe");
        setBooleanField(term3015, term3015.getClass(), "required", false);
        setBooleanField(term3015, term3015.getClass(), "optionalArg", false);
        setIntField(term3015, term3015.getClass(), "numberOfArgs", -244121226);
        setField(term3015, term3015.getClass(), "type", null);
        setField(term3015, term3015.getClass(), "values", term3067);
        setCharField(term3015, term3015.getClass(), "valuesep", 'z');
        term3072 = new Integer(-203030934);
        ArrayList term10080 = new ArrayList();
        term10071 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10071, term10071.getClass(), "opt", "lHfTrWKMPk");
        setField(term10071, term10071.getClass(), "longOpt", "JDaAnsVTGV");
        setField(term10071, term10071.getClass(), "argName", "mLUZFTfjle");
        setField(term10071, term10071.getClass(), "description", "xIeFjkHkOe");
        setBooleanField(term10071, term10071.getClass(), "required", false);
        setBooleanField(term10071, term10071.getClass(), "optionalArg", false);
        setIntField(term10071, term10071.getClass(), "numberOfArgs", -244121226);
        setField(term10071, term10071.getClass(), "type", null);
        setField(term10071, term10071.getClass(), "values", term10080);
        setCharField(term10071, term10071.getClass(), "valuesep", 'z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3072;
        Object retValue = callMethod(klass, "getValue", argTypes, term3015, args);
        assertTrue(recursiveEquals(term3015, term10071));
        assertTrue(recursiveEquals(term3072, -203030934));
        assertTrue(recursiveEquals(retValue, null));
    }

};


