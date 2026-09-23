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

public class Option_getLongOpt_66861836452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644;
     Object term5768;

    public Option_getLongOpt_66861836452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term696 = new ArrayList();
        term644 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term644, term644.getClass(), "opt", "OclPbYPkcH");
        setField(term644, term644.getClass(), "longOpt", "IoAlmYsBwc");
        setField(term644, term644.getClass(), "argName", "TEParAifyi");
        setField(term644, term644.getClass(), "description", "OWDIEULEFu");
        setBooleanField(term644, term644.getClass(), "required", false);
        setBooleanField(term644, term644.getClass(), "optionalArg", true);
        setIntField(term644, term644.getClass(), "numberOfArgs", -616727354);
        setField(term644, term644.getClass(), "type", null);
        setField(term644, term644.getClass(), "values", term696);
        setCharField(term644, term644.getClass(), "valuesep", 'n');
        ArrayList term5777 = new ArrayList();
        term5768 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5768, term5768.getClass(), "opt", "OclPbYPkcH");
        setField(term5768, term5768.getClass(), "longOpt", "IoAlmYsBwc");
        setField(term5768, term5768.getClass(), "argName", "TEParAifyi");
        setField(term5768, term5768.getClass(), "description", "OWDIEULEFu");
        setBooleanField(term5768, term5768.getClass(), "required", false);
        setBooleanField(term5768, term5768.getClass(), "optionalArg", true);
        setIntField(term5768, term5768.getClass(), "numberOfArgs", -616727354);
        setField(term5768, term5768.getClass(), "type", null);
        setField(term5768, term5768.getClass(), "values", term5777);
        setCharField(term5768, term5768.getClass(), "valuesep", 'n');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOpt", argTypes, term644, args);
        assertTrue(recursiveEquals(term644, term5768));
        assertTrue(recursiveEquals(retValue, "IoAlmYsBwc"));
    }

};


