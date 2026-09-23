package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseChildren_1478920219179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56015;
     Object term56085;

    public TypeInference_traverseChildren_1478920219179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56015 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term56085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56155, term56155.getClass(), "type", 18);
        setIntField(term56225, term56225.getClass(), "type", 18);
        setIntField(term56295, term56295.getClass(), "type", 18);
        setIntField(term56365, term56365.getClass(), "type", 18);
        setIntField(term56435, term56435.getClass(), "type", 18);
        setIntField(term56505, term56505.getClass(), "type", 18);
        setIntField(term56575, term56575.getClass(), "type", 18);
        setIntField(term56645, term56645.getClass(), "type", 18);
        setIntField(term56715, term56715.getClass(), "type", 18);
        setIntField(term56785, term56785.getClass(), "type", 18);
        setIntField(term56855, term56855.getClass(), "type", 18);
        setIntField(term56925, term56925.getClass(), "type", 18);
        setIntField(term56995, term56995.getClass(), "type", 18);
        setIntField(term57065, term57065.getClass(), "type", 18);
        setIntField(term57135, term57135.getClass(), "type", 18);
        setIntField(term57205, term57205.getClass(), "type", 18);
        setIntField(term57275, term57275.getClass(), "type", 18);
        setIntField(term57345, term57345.getClass(), "type", 18);
        setIntField(term57415, term57415.getClass(), "type", 18);
        setIntField(term57485, term57485.getClass(), "type", 18);
        setIntField(term57555, term57555.getClass(), "type", 18);
        setIntField(term57625, term57625.getClass(), "type", 18);
        setIntField(term57695, term57695.getClass(), "type", 18);
        setIntField(term57765, term57765.getClass(), "type", 18);
        setIntField(term57835, term57835.getClass(), "type", 18);
        setIntField(term57905, term57905.getClass(), "type", 18);
        setIntField(term57975, term57975.getClass(), "type", 18);
        setIntField(term58045, term58045.getClass(), "type", 18);
        setIntField(term58115, term58115.getClass(), "type", 18);
        setIntField(term58185, term58185.getClass(), "type", 18);
        setIntField(term58255, term58255.getClass(), "type", 18);
        setIntField(term58325, term58325.getClass(), "type", 18);
        setIntField(term58395, term58395.getClass(), "type", 18);
        setIntField(term58465, term58465.getClass(), "type", 114);
        setField(term58395, term58395.getClass(), "first", term58465);
        setField(term58325, term58325.getClass(), "first", term58395);
        setField(term58255, term58255.getClass(), "first", term58325);
        setField(term58185, term58185.getClass(), "first", term58255);
        setField(term58115, term58115.getClass(), "first", term58185);
        setField(term58045, term58045.getClass(), "first", term58115);
        setField(term57975, term57975.getClass(), "first", term58045);
        setField(term57905, term57905.getClass(), "first", term57975);
        setField(term57835, term57835.getClass(), "first", term57905);
        setField(term57765, term57765.getClass(), "first", term57835);
        setField(term57695, term57695.getClass(), "first", term57765);
        setField(term57625, term57625.getClass(), "first", term57695);
        setField(term57555, term57555.getClass(), "first", term57625);
        setField(term57485, term57485.getClass(), "first", term57555);
        setField(term57415, term57415.getClass(), "first", term57485);
        setField(term57345, term57345.getClass(), "first", term57415);
        setField(term57275, term57275.getClass(), "first", term57345);
        setField(term57205, term57205.getClass(), "first", term57275);
        setField(term57135, term57135.getClass(), "first", term57205);
        setField(term57065, term57065.getClass(), "first", term57135);
        setField(term56995, term56995.getClass(), "first", term57065);
        setField(term56925, term56925.getClass(), "first", term56995);
        setField(term56855, term56855.getClass(), "first", term56925);
        setField(term56785, term56785.getClass(), "first", term56855);
        setField(term56715, term56715.getClass(), "first", term56785);
        setField(term56645, term56645.getClass(), "first", term56715);
        setField(term56575, term56575.getClass(), "first", term56645);
        setField(term56505, term56505.getClass(), "first", term56575);
        setField(term56435, term56435.getClass(), "first", term56505);
        setField(term56365, term56365.getClass(), "first", term56435);
        setField(term56295, term56295.getClass(), "first", term56365);
        setField(term56225, term56225.getClass(), "first", term56295);
        setField(term56155, term56155.getClass(), "first", term56225);
        setField(term56085, term56085.getClass(), "first", term56155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term56085;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term56015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


