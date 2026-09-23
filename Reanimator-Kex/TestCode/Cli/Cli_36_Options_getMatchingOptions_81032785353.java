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
import java.lang.ClassCastException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.Object;

public class Options_getMatchingOptions_81032785353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9851;

    public Options_getMatchingOptions_81032785353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10015 = new ArrayList();
        LinkedHashMap term9911 = new LinkedHashMap();
        ((LinkedHashMap) term9911).put(term10015, term10015);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        ((LinkedHashMap) term9911).put((Object)null, (Object)null);
        term9851 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term9851, term9851.getClass(), "longOpts", term9911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "getMatchingOptions", argTypes, term9851, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


