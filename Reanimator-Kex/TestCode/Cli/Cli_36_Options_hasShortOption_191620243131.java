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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Options_hasShortOption_191620243131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;
     Object term3839;

    public Options_hasShortOption_191620243131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term770 = new LinkedHashMap();
        LinkedHashMap term776 = new LinkedHashMap();
        ArrayList term782 = new ArrayList();
        HashMap term786 = new HashMap();
        term769 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term769, term769.getClass(), "shortOpts", term770);
        setField(term769, term769.getClass(), "longOpts", term776);
        setField(term769, term769.getClass(), "requiredOpts", term782);
        setField(term769, term769.getClass(), "optionGroups", term786);
        LinkedHashMap term3840 = new LinkedHashMap();
        LinkedHashMap term3841 = new LinkedHashMap();
        ArrayList term3842 = new ArrayList();
        HashMap term3844 = new HashMap();
        term3839 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3839, term3839.getClass(), "shortOpts", term3840);
        setField(term3839, term3839.getClass(), "longOpts", term3841);
        setField(term3839, term3839.getClass(), "requiredOpts", term3842);
        setField(term3839, term3839.getClass(), "optionGroups", term3844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "hasShortOption", argTypes, term769, args);
        assertTrue(recursiveEquals(term769, term3839));
    }

};


