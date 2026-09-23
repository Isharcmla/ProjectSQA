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

public class Options_getMatchingOptions_810327853115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33794;
     Object term34834;
     Object term34429;

    public Options_getMatchingOptions_810327853115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term33854 = new LinkedHashMap();
        ((LinkedHashMap) term33854).put("                                                                                                                                ", "                                                                                                                                ");
        term33794 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term33794, term33794.getClass(), "longOpts", term33854);
        LinkedHashMap term34835 = new LinkedHashMap();
        term34834 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term34834, term34834.getClass(), "shortOpts", null);
        setField(term34834, term34834.getClass(), "longOpts", term34835);
        setField(term34834, term34834.getClass(), "requiredOpts", null);
        setField(term34834, term34834.getClass(), "optionGroups", null);
        term34429 = new ArrayList();
        ((ArrayList) term34429).add("                                                                                                                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                ";
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term33794, args);
        assertTrue(recursiveEquals(term33794, term34834));
        assertTrue(recursiveEquals(retValue, term34429));
    }

};


