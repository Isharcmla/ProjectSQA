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

public class Option_clone_3724270683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3853;
     Object term11701;
     Object term11586;

    public Option_clone_3724270683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3906 = new ArrayList();
        term3853 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3905 = newInstance(Class.forName("java.lang.Object"));
        setField(term3853, term3853.getClass(), "opt", "HWkpTmtlrc");
        setField(term3853, term3853.getClass(), "longOpt", "hMmaoREuCK");
        setField(term3853, term3853.getClass(), "argName", "VeDtgDzGAN");
        setField(term3853, term3853.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term3853, term3853.getClass(), "required", true);
        setBooleanField(term3853, term3853.getClass(), "optionalArg", false);
        setIntField(term3853, term3853.getClass(), "numberOfArgs", -1145578966);
        setField(term3853, term3853.getClass(), "type", term3905);
        setField(term3853, term3853.getClass(), "values", term3906);
        setCharField(term3853, term3853.getClass(), "valuesep", 'Y');
        ArrayList term11711 = new ArrayList();
        term11701 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11710 = newInstance(Class.forName("java.lang.Object"));
        setField(term11701, term11701.getClass(), "opt", "HWkpTmtlrc");
        setField(term11701, term11701.getClass(), "longOpt", "hMmaoREuCK");
        setField(term11701, term11701.getClass(), "argName", "VeDtgDzGAN");
        setField(term11701, term11701.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term11701, term11701.getClass(), "required", true);
        setBooleanField(term11701, term11701.getClass(), "optionalArg", false);
        setIntField(term11701, term11701.getClass(), "numberOfArgs", -1145578966);
        setField(term11701, term11701.getClass(), "type", term11710);
        setField(term11701, term11701.getClass(), "values", term11711);
        setCharField(term11701, term11701.getClass(), "valuesep", 'Y');
        ArrayList term11639 = new ArrayList();
        term11586 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11638 = newInstance(Class.forName("java.lang.Object"));
        setField(term11586, term11586.getClass(), "opt", "HWkpTmtlrc");
        setField(term11586, term11586.getClass(), "longOpt", "hMmaoREuCK");
        setField(term11586, term11586.getClass(), "argName", "VeDtgDzGAN");
        setField(term11586, term11586.getClass(), "description", "aWYOWZFyaX");
        setBooleanField(term11586, term11586.getClass(), "required", true);
        setBooleanField(term11586, term11586.getClass(), "optionalArg", false);
        setIntField(term11586, term11586.getClass(), "numberOfArgs", -1145578966);
        setField(term11586, term11586.getClass(), "type", term11638);
        setField(term11586, term11586.getClass(), "values", term11639);
        setCharField(term11586, term11586.getClass(), "valuesep", 'Y');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term3853, args);
        assertTrue(recursiveEquals(term3853, term11701));
        assertTrue(recursiveEquals(retValue, term11586));
    }

};


