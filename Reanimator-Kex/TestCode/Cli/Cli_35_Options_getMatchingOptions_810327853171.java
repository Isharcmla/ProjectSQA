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

public class Options_getMatchingOptions_810327853171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55870;
     Object term56218;
     Object term56197;

    public Options_getMatchingOptions_810327853171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term55930 = new LinkedHashMap();
        ((LinkedHashMap) term55930).put("", "");
        ((LinkedHashMap) term55930).put("", "");
        term55870 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term55870, term55870.getClass(), "longOpts", term55930);
        LinkedHashMap term56219 = new LinkedHashMap();
        term56218 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term56218, term56218.getClass(), "shortOpts", null);
        setField(term56218, term56218.getClass(), "longOpts", term56219);
        setField(term56218, term56218.getClass(), "requiredOpts", null);
        setField(term56218, term56218.getClass(), "optionGroups", null);
        term56197 = new ArrayList();
        ((ArrayList) term56197).add("");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term55870, args);
        assertTrue(recursiveEquals(term55870, term56218));
        assertTrue(recursiveEquals(retValue, term56197));
    }

};


