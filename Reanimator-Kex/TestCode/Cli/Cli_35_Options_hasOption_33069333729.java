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

public class Options_hasOption_33069333729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;
     Object term3681;

    public Options_hasOption_33069333729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term682 = new LinkedHashMap();
        LinkedHashMap term688 = new LinkedHashMap();
        ArrayList term694 = new ArrayList();
        HashMap term698 = new HashMap();
        term681 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term681, term681.getClass(), "shortOpts", term682);
        setField(term681, term681.getClass(), "longOpts", term688);
        setField(term681, term681.getClass(), "requiredOpts", term694);
        setField(term681, term681.getClass(), "optionGroups", term698);
        LinkedHashMap term3682 = new LinkedHashMap();
        LinkedHashMap term3683 = new LinkedHashMap();
        ArrayList term3684 = new ArrayList();
        HashMap term3686 = new HashMap();
        term3681 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term3681, term3681.getClass(), "shortOpts", term3682);
        setField(term3681, term3681.getClass(), "longOpts", term3683);
        setField(term3681, term3681.getClass(), "requiredOpts", term3684);
        setField(term3681, term3681.getClass(), "optionGroups", term3686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        Object retValue = callMethod(klass, "hasOption", argTypes, term681, args);
        assertTrue(recursiveEquals(term681, term3681));
        assertTrue(recursiveEquals(retValue, false));
    }

};


