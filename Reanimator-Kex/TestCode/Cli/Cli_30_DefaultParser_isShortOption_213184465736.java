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

public class DefaultParser_isShortOption_213184465736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2380;
     Object term9267;

    public DefaultParser_isShortOption_213184465736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2382 = new LinkedList();
        ArrayList term2385 = new ArrayList();
        HashMap term2390 = new HashMap();
        HashMap term2395 = new HashMap();
        ArrayList term2400 = new ArrayList();
        HashMap term2404 = new HashMap();
        ArrayList term2475 = new ArrayList();
        ArrayList term2481 = new ArrayList();
        term2380 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2381 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2389 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2422 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2474 = newInstance(Class.forName("java.lang.Object"));
        setField(term2381, term2381.getClass(), "args", term2382);
        setField(term2381, term2381.getClass(), "options", term2385);
        setField(term2380, term2380.getClass(), "cmd", term2381);
        setField(term2389, term2389.getClass(), "shortOpts", term2390);
        setField(term2389, term2389.getClass(), "longOpts", term2395);
        setField(term2389, term2389.getClass(), "requiredOpts", term2400);
        setField(term2389, term2389.getClass(), "optionGroups", term2404);
        setField(term2380, term2380.getClass(), "options", term2389);
        setBooleanField(term2380, term2380.getClass(), "stopAtNonOption", true);
        setField(term2380, term2380.getClass(), "currentToken", "vQVyKLdtaz");
        setField(term2422, term2422.getClass(), "opt", "OWKQODBLzb");
        setField(term2422, term2422.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term2422, term2422.getClass(), "argName", "idgaQsnJpQ");
        setField(term2422, term2422.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term2422, term2422.getClass(), "required", true);
        setBooleanField(term2422, term2422.getClass(), "optionalArg", false);
        setIntField(term2422, term2422.getClass(), "numberOfArgs", -522618178);
        setField(term2422, term2422.getClass(), "type", term2474);
        setField(term2422, term2422.getClass(), "values", term2475);
        setCharField(term2422, term2422.getClass(), "valuesep", 'j');
        setField(term2380, term2380.getClass(), "currentOption", term2422);
        setBooleanField(term2380, term2380.getClass(), "skipParsing", true);
        setField(term2380, term2380.getClass(), "expectedOpts", term2481);
        LinkedList term9269 = new LinkedList();
        ArrayList term9270 = new ArrayList();
        HashMap term9273 = new HashMap();
        HashMap term9274 = new HashMap();
        ArrayList term9275 = new ArrayList();
        HashMap term9277 = new HashMap();
        ArrayList term9290 = new ArrayList();
        ArrayList term9292 = new ArrayList();
        term9267 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9268 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9272 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9280 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term9289 = newInstance(Class.forName("java.lang.Object"));
        setField(term9268, term9268.getClass(), "args", term9269);
        setField(term9268, term9268.getClass(), "options", term9270);
        setField(term9267, term9267.getClass(), "cmd", term9268);
        setField(term9272, term9272.getClass(), "shortOpts", term9273);
        setField(term9272, term9272.getClass(), "longOpts", term9274);
        setField(term9272, term9272.getClass(), "requiredOpts", term9275);
        setField(term9272, term9272.getClass(), "optionGroups", term9277);
        setField(term9267, term9267.getClass(), "options", term9272);
        setBooleanField(term9267, term9267.getClass(), "stopAtNonOption", true);
        setField(term9267, term9267.getClass(), "currentToken", "vQVyKLdtaz");
        setField(term9280, term9280.getClass(), "opt", "OWKQODBLzb");
        setField(term9280, term9280.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term9280, term9280.getClass(), "argName", "idgaQsnJpQ");
        setField(term9280, term9280.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term9280, term9280.getClass(), "required", true);
        setBooleanField(term9280, term9280.getClass(), "optionalArg", false);
        setIntField(term9280, term9280.getClass(), "numberOfArgs", -522618178);
        setField(term9280, term9280.getClass(), "type", term9289);
        setField(term9280, term9280.getClass(), "values", term9290);
        setCharField(term9280, term9280.getClass(), "valuesep", 'j');
        setField(term9267, term9267.getClass(), "currentOption", term9280);
        setBooleanField(term9267, term9267.getClass(), "skipParsing", true);
        setField(term9267, term9267.getClass(), "expectedOpts", term9292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        Object retValue = callMethod(klass, "isShortOption", argTypes, term2380, args);
        assertTrue(recursiveEquals(term2380, term9267));
        assertTrue(recursiveEquals(retValue, false));
    }

};


