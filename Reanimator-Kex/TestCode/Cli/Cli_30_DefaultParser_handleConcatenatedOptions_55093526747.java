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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_handleConcatenatedOptions_55093526747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4479;
     Object term14448;

    public DefaultParser_handleConcatenatedOptions_55093526747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4481 = new LinkedList();
        ArrayList term4484 = new ArrayList();
        HashMap term4489 = new HashMap();
        HashMap term4494 = new HashMap();
        ArrayList term4499 = new ArrayList();
        HashMap term4503 = new HashMap();
        ArrayList term4574 = new ArrayList();
        ArrayList term4580 = new ArrayList();
        term4479 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4480 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4488 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4521 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4573 = newInstance(Class.forName("java.lang.Object"));
        setField(term4480, term4480.getClass(), "args", term4481);
        setField(term4480, term4480.getClass(), "options", term4484);
        setField(term4479, term4479.getClass(), "cmd", term4480);
        setField(term4488, term4488.getClass(), "shortOpts", term4489);
        setField(term4488, term4488.getClass(), "longOpts", term4494);
        setField(term4488, term4488.getClass(), "requiredOpts", term4499);
        setField(term4488, term4488.getClass(), "optionGroups", term4503);
        setField(term4479, term4479.getClass(), "options", term4488);
        setBooleanField(term4479, term4479.getClass(), "stopAtNonOption", false);
        setField(term4479, term4479.getClass(), "currentToken", "HzqpegHiRq");
        setField(term4521, term4521.getClass(), "opt", "jwsfVjMoJT");
        setField(term4521, term4521.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term4521, term4521.getClass(), "argName", "MwwjNtdOFT");
        setField(term4521, term4521.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term4521, term4521.getClass(), "required", false);
        setBooleanField(term4521, term4521.getClass(), "optionalArg", true);
        setIntField(term4521, term4521.getClass(), "numberOfArgs", -1007160944);
        setField(term4521, term4521.getClass(), "type", term4573);
        setField(term4521, term4521.getClass(), "values", term4574);
        setCharField(term4521, term4521.getClass(), "valuesep", 'g');
        setField(term4479, term4479.getClass(), "currentOption", term4521);
        setBooleanField(term4479, term4479.getClass(), "skipParsing", true);
        setField(term4479, term4479.getClass(), "expectedOpts", term4580);
        LinkedList term14450 = new LinkedList();
        ((LinkedList) term14450).add("");
        ArrayList term14453 = new ArrayList();
        HashMap term14456 = new HashMap();
        HashMap term14457 = new HashMap();
        ArrayList term14458 = new ArrayList();
        HashMap term14460 = new HashMap();
        ArrayList term14473 = new ArrayList();
        ArrayList term14475 = new ArrayList();
        term14448 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term14449 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term14455 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term14463 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term14472 = newInstance(Class.forName("java.lang.Object"));
        setField(term14449, term14449.getClass(), "args", term14450);
        setField(term14449, term14449.getClass(), "options", term14453);
        setField(term14448, term14448.getClass(), "cmd", term14449);
        setField(term14455, term14455.getClass(), "shortOpts", term14456);
        setField(term14455, term14455.getClass(), "longOpts", term14457);
        setField(term14455, term14455.getClass(), "requiredOpts", term14458);
        setField(term14455, term14455.getClass(), "optionGroups", term14460);
        setField(term14448, term14448.getClass(), "options", term14455);
        setBooleanField(term14448, term14448.getClass(), "stopAtNonOption", false);
        setField(term14448, term14448.getClass(), "currentToken", "HzqpegHiRq");
        setField(term14463, term14463.getClass(), "opt", "jwsfVjMoJT");
        setField(term14463, term14463.getClass(), "longOpt", "ZfdXfCCFDf");
        setField(term14463, term14463.getClass(), "argName", "MwwjNtdOFT");
        setField(term14463, term14463.getClass(), "description", "VYkqXKVlAJ");
        setBooleanField(term14463, term14463.getClass(), "required", false);
        setBooleanField(term14463, term14463.getClass(), "optionalArg", true);
        setIntField(term14463, term14463.getClass(), "numberOfArgs", -1007160944);
        setField(term14463, term14463.getClass(), "type", term14472);
        setField(term14463, term14463.getClass(), "values", term14473);
        setCharField(term14463, term14463.getClass(), "valuesep", 'g');
        setField(term14448, term14448.getClass(), "currentOption", term14463);
        setBooleanField(term14448, term14448.getClass(), "skipParsing", true);
        setField(term14448, term14448.getClass(), "expectedOpts", term14475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "handleConcatenatedOptions", argTypes, term4479, args);
        assertTrue(recursiveEquals(term4479, term14448));
    }

};


