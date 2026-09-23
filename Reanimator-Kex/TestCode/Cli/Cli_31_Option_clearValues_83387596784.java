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

public class Option_clearValues_83387596784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3951;
     Object term11891;

    public Option_clearValues_83387596784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4004 = new ArrayList();
        term3951 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4003 = newInstance(Class.forName("java.lang.Object"));
        setField(term3951, term3951.getClass(), "opt", "BRIVNtfUWU");
        setField(term3951, term3951.getClass(), "longOpt", "DbiCVtPPCT");
        setField(term3951, term3951.getClass(), "argName", "WzFopsaDuG");
        setField(term3951, term3951.getClass(), "description", "PapWxkhEWe");
        setBooleanField(term3951, term3951.getClass(), "required", false);
        setBooleanField(term3951, term3951.getClass(), "optionalArg", true);
        setIntField(term3951, term3951.getClass(), "numberOfArgs", 679763016);
        setField(term3951, term3951.getClass(), "type", term4003);
        setField(term3951, term3951.getClass(), "values", term4004);
        setCharField(term3951, term3951.getClass(), "valuesep", 'F');
        ArrayList term11901 = new ArrayList();
        term11891 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term11900 = newInstance(Class.forName("java.lang.Object"));
        setField(term11891, term11891.getClass(), "opt", "BRIVNtfUWU");
        setField(term11891, term11891.getClass(), "longOpt", "DbiCVtPPCT");
        setField(term11891, term11891.getClass(), "argName", "WzFopsaDuG");
        setField(term11891, term11891.getClass(), "description", "PapWxkhEWe");
        setBooleanField(term11891, term11891.getClass(), "required", false);
        setBooleanField(term11891, term11891.getClass(), "optionalArg", true);
        setIntField(term11891, term11891.getClass(), "numberOfArgs", 679763016);
        setField(term11891, term11891.getClass(), "type", term11900);
        setField(term11891, term11891.getClass(), "values", term11901);
        setCharField(term11891, term11891.getClass(), "valuesep", 'F');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearValues", argTypes, term3951, args);
        assertTrue(recursiveEquals(term3951, term11891));
    }

};


