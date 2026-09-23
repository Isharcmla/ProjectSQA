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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39351;
     Object term39443;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term39443 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39719 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term39995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40271 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40639 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42571 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42939, term42939.getClass(), "next", term43031);
        setField(term42847, term42847.getClass(), "next", term42939);
        setField(term42755, term42755.getClass(), "next", term42847);
        setField(term42663, term42663.getClass(), "next", term42755);
        setField(term42571, term42571.getClass(), "next", term42663);
        setField(term42479, term42479.getClass(), "next", term42571);
        setField(term42387, term42387.getClass(), "next", term42479);
        setField(term42295, term42295.getClass(), "next", term42387);
        setField(term42203, term42203.getClass(), "next", term42295);
        setField(term42111, term42111.getClass(), "next", term42203);
        setField(term42019, term42019.getClass(), "next", term42111);
        setField(term41927, term41927.getClass(), "next", term42019);
        setField(term41835, term41835.getClass(), "next", term41927);
        setField(term41743, term41743.getClass(), "next", term41835);
        setField(term41651, term41651.getClass(), "next", term41743);
        setField(term41559, term41559.getClass(), "next", term41651);
        setField(term41467, term41467.getClass(), "next", term41559);
        setField(term41375, term41375.getClass(), "next", term41467);
        setField(term41283, term41283.getClass(), "next", term41375);
        setField(term41191, term41191.getClass(), "next", term41283);
        setField(term41099, term41099.getClass(), "next", term41191);
        setField(term41007, term41007.getClass(), "next", term41099);
        setField(term40915, term40915.getClass(), "next", term41007);
        setField(term40823, term40823.getClass(), "next", term40915);
        setField(term40731, term40731.getClass(), "next", term40823);
        setField(term40639, term40639.getClass(), "next", term40731);
        setField(term40547, term40547.getClass(), "next", term40639);
        setField(term40455, term40455.getClass(), "next", term40547);
        setField(term40363, term40363.getClass(), "next", term40455);
        setField(term40271, term40271.getClass(), "next", term40363);
        setField(term40179, term40179.getClass(), "next", term40271);
        setField(term40087, term40087.getClass(), "next", term40179);
        setField(term39995, term39995.getClass(), "next", term40087);
        setField(term39903, term39903.getClass(), "next", term39995);
        setField(term39811, term39811.getClass(), "next", term39903);
        setField(term39719, term39719.getClass(), "next", term39811);
        setField(term39627, term39627.getClass(), "next", term39719);
        setField(term39535, term39535.getClass(), "next", term39627);
        setField(term39443, term39443.getClass(), "next", term39535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term39443;
        args[1] = null;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term39351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


