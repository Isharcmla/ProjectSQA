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

public class TypeInference_traverseReturn_1142297770484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1432385;
     Object term1432455;

    public TypeInference_traverseReturn_1142297770484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1432385 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1432455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1435605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1432525, term1432525.getClass(), "type", 29);
        setIntField(term1432595, term1432595.getClass(), "type", 29);
        setIntField(term1432665, term1432665.getClass(), "type", 29);
        setIntField(term1432735, term1432735.getClass(), "type", 29);
        setIntField(term1432805, term1432805.getClass(), "type", 29);
        setIntField(term1432875, term1432875.getClass(), "type", 29);
        setIntField(term1432945, term1432945.getClass(), "type", 29);
        setIntField(term1433015, term1433015.getClass(), "type", 29);
        setIntField(term1433085, term1433085.getClass(), "type", 29);
        setIntField(term1433155, term1433155.getClass(), "type", 29);
        setIntField(term1433225, term1433225.getClass(), "type", 29);
        setIntField(term1433295, term1433295.getClass(), "type", 29);
        setIntField(term1433365, term1433365.getClass(), "type", 29);
        setIntField(term1433435, term1433435.getClass(), "type", 29);
        setIntField(term1433505, term1433505.getClass(), "type", 29);
        setIntField(term1433575, term1433575.getClass(), "type", 29);
        setIntField(term1433645, term1433645.getClass(), "type", 29);
        setIntField(term1433715, term1433715.getClass(), "type", 29);
        setIntField(term1433785, term1433785.getClass(), "type", 29);
        setIntField(term1433855, term1433855.getClass(), "type", 29);
        setIntField(term1433925, term1433925.getClass(), "type", 29);
        setIntField(term1433995, term1433995.getClass(), "type", 29);
        setIntField(term1434065, term1434065.getClass(), "type", 29);
        setIntField(term1434135, term1434135.getClass(), "type", 29);
        setIntField(term1434205, term1434205.getClass(), "type", 29);
        setIntField(term1434275, term1434275.getClass(), "type", 29);
        setIntField(term1434345, term1434345.getClass(), "type", 29);
        setIntField(term1434415, term1434415.getClass(), "type", 29);
        setIntField(term1434485, term1434485.getClass(), "type", 29);
        setIntField(term1434555, term1434555.getClass(), "type", 29);
        setIntField(term1434625, term1434625.getClass(), "type", 29);
        setIntField(term1434695, term1434695.getClass(), "type", 29);
        setIntField(term1434765, term1434765.getClass(), "type", 29);
        setIntField(term1434835, term1434835.getClass(), "type", 29);
        setIntField(term1434905, term1434905.getClass(), "type", 29);
        setIntField(term1434975, term1434975.getClass(), "type", 29);
        setIntField(term1435045, term1435045.getClass(), "type", 29);
        setIntField(term1435115, term1435115.getClass(), "type", 29);
        setIntField(term1435185, term1435185.getClass(), "type", 29);
        setIntField(term1435255, term1435255.getClass(), "type", 29);
        setIntField(term1435325, term1435325.getClass(), "type", 29);
        setIntField(term1435395, term1435395.getClass(), "type", 29);
        setIntField(term1435465, term1435465.getClass(), "type", 29);
        setIntField(term1435535, term1435535.getClass(), "type", 29);
        setIntField(term1435605, term1435605.getClass(), "type", 152);
        setField(term1435535, term1435535.getClass(), "first", term1435605);
        setField(term1435465, term1435465.getClass(), "first", term1435535);
        setField(term1435395, term1435395.getClass(), "first", term1435465);
        setField(term1435325, term1435325.getClass(), "first", term1435395);
        setField(term1435255, term1435255.getClass(), "first", term1435325);
        setField(term1435185, term1435185.getClass(), "first", term1435255);
        setField(term1435115, term1435115.getClass(), "first", term1435185);
        setField(term1435045, term1435045.getClass(), "first", term1435115);
        setField(term1434975, term1434975.getClass(), "first", term1435045);
        setField(term1434905, term1434905.getClass(), "first", term1434975);
        setField(term1434835, term1434835.getClass(), "first", term1434905);
        setField(term1434765, term1434765.getClass(), "first", term1434835);
        setField(term1434695, term1434695.getClass(), "first", term1434765);
        setField(term1434625, term1434625.getClass(), "first", term1434695);
        setField(term1434555, term1434555.getClass(), "first", term1434625);
        setField(term1434485, term1434485.getClass(), "first", term1434555);
        setField(term1434415, term1434415.getClass(), "first", term1434485);
        setField(term1434345, term1434345.getClass(), "first", term1434415);
        setField(term1434275, term1434275.getClass(), "first", term1434345);
        setField(term1434205, term1434205.getClass(), "first", term1434275);
        setField(term1434135, term1434135.getClass(), "first", term1434205);
        setField(term1434065, term1434065.getClass(), "first", term1434135);
        setField(term1433995, term1433995.getClass(), "first", term1434065);
        setField(term1433925, term1433925.getClass(), "first", term1433995);
        setField(term1433855, term1433855.getClass(), "first", term1433925);
        setField(term1433785, term1433785.getClass(), "first", term1433855);
        setField(term1433715, term1433715.getClass(), "first", term1433785);
        setField(term1433645, term1433645.getClass(), "first", term1433715);
        setField(term1433575, term1433575.getClass(), "first", term1433645);
        setField(term1433505, term1433505.getClass(), "first", term1433575);
        setField(term1433435, term1433435.getClass(), "first", term1433505);
        setField(term1433365, term1433365.getClass(), "first", term1433435);
        setField(term1433295, term1433295.getClass(), "first", term1433365);
        setField(term1433225, term1433225.getClass(), "first", term1433295);
        setField(term1433155, term1433155.getClass(), "first", term1433225);
        setField(term1433085, term1433085.getClass(), "first", term1433155);
        setField(term1433015, term1433015.getClass(), "first", term1433085);
        setField(term1432945, term1432945.getClass(), "first", term1433015);
        setField(term1432875, term1432875.getClass(), "first", term1432945);
        setField(term1432805, term1432805.getClass(), "first", term1432875);
        setField(term1432735, term1432735.getClass(), "first", term1432805);
        setField(term1432665, term1432665.getClass(), "first", term1432735);
        setField(term1432595, term1432595.getClass(), "first", term1432665);
        setField(term1432525, term1432525.getClass(), "first", term1432595);
        setField(term1432455, term1432455.getClass(), "first", term1432525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1432455;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1432385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


