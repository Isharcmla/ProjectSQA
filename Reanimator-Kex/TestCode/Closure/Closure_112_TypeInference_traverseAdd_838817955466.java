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

public class TypeInference_traverseAdd_838817955466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1760335;
     Object term1760405;

    public TypeInference_traverseAdd_838817955466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1760335 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1760405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1760475, term1760475.getClass(), "next", null);
        setIntField(term1760475, term1760475.getClass(), "type", 14);
        setIntField(term1760545, term1760545.getClass(), "type", 14);
        setIntField(term1760615, term1760615.getClass(), "type", 14);
        setIntField(term1760685, term1760685.getClass(), "type", 14);
        setIntField(term1760755, term1760755.getClass(), "type", 14);
        setIntField(term1760825, term1760825.getClass(), "type", 14);
        setIntField(term1760895, term1760895.getClass(), "type", 14);
        setIntField(term1760965, term1760965.getClass(), "type", 14);
        setIntField(term1761035, term1761035.getClass(), "type", 14);
        setIntField(term1761105, term1761105.getClass(), "type", 14);
        setIntField(term1761175, term1761175.getClass(), "type", 14);
        setIntField(term1761245, term1761245.getClass(), "type", 14);
        setIntField(term1761315, term1761315.getClass(), "type", 14);
        setIntField(term1761385, term1761385.getClass(), "type", 14);
        setIntField(term1761455, term1761455.getClass(), "type", 14);
        setIntField(term1761525, term1761525.getClass(), "type", 14);
        setIntField(term1761595, term1761595.getClass(), "type", 14);
        setIntField(term1761665, term1761665.getClass(), "type", 14);
        setIntField(term1761735, term1761735.getClass(), "type", 14);
        setIntField(term1761805, term1761805.getClass(), "type", 14);
        setIntField(term1761875, term1761875.getClass(), "type", 14);
        setIntField(term1761945, term1761945.getClass(), "type", 14);
        setIntField(term1762015, term1762015.getClass(), "type", 14);
        setIntField(term1762085, term1762085.getClass(), "type", 14);
        setIntField(term1762155, term1762155.getClass(), "type", 14);
        setIntField(term1762225, term1762225.getClass(), "type", 14);
        setIntField(term1762295, term1762295.getClass(), "type", 14);
        setIntField(term1762365, term1762365.getClass(), "type", 14);
        setIntField(term1762435, term1762435.getClass(), "type", 14);
        setIntField(term1762505, term1762505.getClass(), "type", 14);
        setIntField(term1762575, term1762575.getClass(), "type", 14);
        setIntField(term1762645, term1762645.getClass(), "type", 14);
        setIntField(term1762715, term1762715.getClass(), "type", 14);
        setIntField(term1762785, term1762785.getClass(), "type", 14);
        setIntField(term1762855, term1762855.getClass(), "type", 14);
        setIntField(term1762925, term1762925.getClass(), "type", 14);
        setIntField(term1762995, term1762995.getClass(), "type", 14);
        setIntField(term1763065, term1763065.getClass(), "type", 14);
        setIntField(term1763135, term1763135.getClass(), "type", 14);
        setIntField(term1763205, term1763205.getClass(), "type", 14);
        setIntField(term1763275, term1763275.getClass(), "type", 14);
        setIntField(term1763345, term1763345.getClass(), "type", 14);
        setIntField(term1763415, term1763415.getClass(), "type", 14);
        setIntField(term1763485, term1763485.getClass(), "type", 14);
        setIntField(term1763555, term1763555.getClass(), "type", 14);
        setIntField(term1763625, term1763625.getClass(), "type", 14);
        setIntField(term1763695, term1763695.getClass(), "type", 14);
        setIntField(term1763765, term1763765.getClass(), "type", 14);
        setIntField(term1763835, term1763835.getClass(), "type", 14);
        setIntField(term1763905, term1763905.getClass(), "type", 14);
        setIntField(term1763975, term1763975.getClass(), "type", 14);
        setIntField(term1764045, term1764045.getClass(), "type", 14);
        setIntField(term1764115, term1764115.getClass(), "type", 14);
        setIntField(term1764185, term1764185.getClass(), "type", 14);
        setIntField(term1764255, term1764255.getClass(), "type", 14);
        setIntField(term1764325, term1764325.getClass(), "type", 14);
        setIntField(term1764395, term1764395.getClass(), "type", 14);
        setIntField(term1764465, term1764465.getClass(), "type", 14);
        setIntField(term1764535, term1764535.getClass(), "type", 14);
        setIntField(term1764605, term1764605.getClass(), "type", 14);
        setIntField(term1764675, term1764675.getClass(), "type", 14);
        setIntField(term1764745, term1764745.getClass(), "type", 100);
        setField(term1764675, term1764675.getClass(), "first", term1764745);
        setField(term1764605, term1764605.getClass(), "first", term1764675);
        setField(term1764535, term1764535.getClass(), "first", term1764605);
        setField(term1764465, term1764465.getClass(), "first", term1764535);
        setField(term1764395, term1764395.getClass(), "first", term1764465);
        setField(term1764325, term1764325.getClass(), "first", term1764395);
        setField(term1764255, term1764255.getClass(), "first", term1764325);
        setField(term1764185, term1764185.getClass(), "first", term1764255);
        setField(term1764115, term1764115.getClass(), "first", term1764185);
        setField(term1764045, term1764045.getClass(), "first", term1764115);
        setField(term1763975, term1763975.getClass(), "first", term1764045);
        setField(term1763905, term1763905.getClass(), "first", term1763975);
        setField(term1763835, term1763835.getClass(), "first", term1763905);
        setField(term1763765, term1763765.getClass(), "first", term1763835);
        setField(term1763695, term1763695.getClass(), "first", term1763765);
        setField(term1763625, term1763625.getClass(), "first", term1763695);
        setField(term1763555, term1763555.getClass(), "first", term1763625);
        setField(term1763485, term1763485.getClass(), "first", term1763555);
        setField(term1763415, term1763415.getClass(), "first", term1763485);
        setField(term1763345, term1763345.getClass(), "first", term1763415);
        setField(term1763275, term1763275.getClass(), "first", term1763345);
        setField(term1763205, term1763205.getClass(), "first", term1763275);
        setField(term1763135, term1763135.getClass(), "first", term1763205);
        setField(term1763065, term1763065.getClass(), "first", term1763135);
        setField(term1762995, term1762995.getClass(), "first", term1763065);
        setField(term1762925, term1762925.getClass(), "first", term1762995);
        setField(term1762855, term1762855.getClass(), "first", term1762925);
        setField(term1762785, term1762785.getClass(), "first", term1762855);
        setField(term1762715, term1762715.getClass(), "first", term1762785);
        setField(term1762645, term1762645.getClass(), "first", term1762715);
        setField(term1762575, term1762575.getClass(), "first", term1762645);
        setField(term1762505, term1762505.getClass(), "first", term1762575);
        setField(term1762435, term1762435.getClass(), "first", term1762505);
        setField(term1762365, term1762365.getClass(), "first", term1762435);
        setField(term1762295, term1762295.getClass(), "first", term1762365);
        setField(term1762225, term1762225.getClass(), "first", term1762295);
        setField(term1762155, term1762155.getClass(), "first", term1762225);
        setField(term1762085, term1762085.getClass(), "first", term1762155);
        setField(term1762015, term1762015.getClass(), "first", term1762085);
        setField(term1761945, term1761945.getClass(), "first", term1762015);
        setField(term1761875, term1761875.getClass(), "first", term1761945);
        setField(term1761805, term1761805.getClass(), "first", term1761875);
        setField(term1761735, term1761735.getClass(), "first", term1761805);
        setField(term1761665, term1761665.getClass(), "first", term1761735);
        setField(term1761595, term1761595.getClass(), "first", term1761665);
        setField(term1761525, term1761525.getClass(), "first", term1761595);
        setField(term1761455, term1761455.getClass(), "first", term1761525);
        setField(term1761385, term1761385.getClass(), "first", term1761455);
        setField(term1761315, term1761315.getClass(), "first", term1761385);
        setField(term1761245, term1761245.getClass(), "first", term1761315);
        setField(term1761175, term1761175.getClass(), "first", term1761245);
        setField(term1761105, term1761105.getClass(), "first", term1761175);
        setField(term1761035, term1761035.getClass(), "first", term1761105);
        setField(term1760965, term1760965.getClass(), "first", term1761035);
        setField(term1760895, term1760895.getClass(), "first", term1760965);
        setField(term1760825, term1760825.getClass(), "first", term1760895);
        setField(term1760755, term1760755.getClass(), "first", term1760825);
        setField(term1760685, term1760685.getClass(), "first", term1760755);
        setField(term1760615, term1760615.getClass(), "first", term1760685);
        setField(term1760545, term1760545.getClass(), "first", term1760615);
        setField(term1760475, term1760475.getClass(), "first", term1760545);
        setField(term1760405, term1760405.getClass(), "first", term1760475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1760405;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1760335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


