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

public class Options_getMatchingOptions_810327853175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57032;
     Object term57342;
     Object term57321;

    public Options_getMatchingOptions_810327853175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term57092 = new LinkedHashMap();
        ((LinkedHashMap) term57092).put("", "");
        term57032 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57032, term57032.getClass(), "longOpts", term57092);
        LinkedHashMap term57343 = new LinkedHashMap();
        term57342 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term57342, term57342.getClass(), "shortOpts", null);
        setField(term57342, term57342.getClass(), "longOpts", term57343);
        setField(term57342, term57342.getClass(), "requiredOpts", null);
        setField(term57342, term57342.getClass(), "optionGroups", null);
        term57321 = new ArrayList();
        ((ArrayList) term57321).add("");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getMatchingOptions", argTypes, term57032, args);
        assertTrue(recursiveEquals(term57032, term57342));
        assertTrue(recursiveEquals(retValue, term57321));
    }

};


