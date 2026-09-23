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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080915;
     Object term1080985;

    public TypeInference_traverseReturn_1142297770413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1080915 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1080985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1081965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1081055, term1081055.getClass(), "type", 29);
        setIntField(term1081125, term1081125.getClass(), "type", 29);
        setIntField(term1081195, term1081195.getClass(), "type", 29);
        setIntField(term1081265, term1081265.getClass(), "type", 29);
        setIntField(term1081335, term1081335.getClass(), "type", 29);
        setIntField(term1081405, term1081405.getClass(), "type", 29);
        setIntField(term1081475, term1081475.getClass(), "type", 29);
        setIntField(term1081545, term1081545.getClass(), "type", 29);
        setIntField(term1081615, term1081615.getClass(), "type", 29);
        setIntField(term1081685, term1081685.getClass(), "type", 29);
        setIntField(term1081755, term1081755.getClass(), "type", 29);
        setIntField(term1081825, term1081825.getClass(), "type", 29);
        setIntField(term1081895, term1081895.getClass(), "type", 29);
        setIntField(term1081965, term1081965.getClass(), "type", 29);
        setIntField(term1082035, term1082035.getClass(), "type", 29);
        setIntField(term1082105, term1082105.getClass(), "type", 29);
        setIntField(term1082175, term1082175.getClass(), "type", 29);
        setIntField(term1082245, term1082245.getClass(), "type", 29);
        setIntField(term1082315, term1082315.getClass(), "type", 29);
        setIntField(term1082385, term1082385.getClass(), "type", 29);
        setIntField(term1082455, term1082455.getClass(), "type", 29);
        setIntField(term1082525, term1082525.getClass(), "type", 29);
        setIntField(term1082595, term1082595.getClass(), "type", 29);
        setIntField(term1082665, term1082665.getClass(), "type", 29);
        setIntField(term1082735, term1082735.getClass(), "type", 29);
        setIntField(term1082805, term1082805.getClass(), "type", 29);
        setIntField(term1082875, term1082875.getClass(), "type", 29);
        setIntField(term1082945, term1082945.getClass(), "type", 29);
        setIntField(term1083015, term1083015.getClass(), "type", 29);
        setIntField(term1083085, term1083085.getClass(), "type", 29);
        setIntField(term1083155, term1083155.getClass(), "type", 29);
        setIntField(term1083225, term1083225.getClass(), "type", 29);
        setIntField(term1083295, term1083295.getClass(), "type", 29);
        setIntField(term1083365, term1083365.getClass(), "type", 29);
        setIntField(term1083435, term1083435.getClass(), "type", 29);
        setIntField(term1083505, term1083505.getClass(), "type", 29);
        setIntField(term1083575, term1083575.getClass(), "type", 29);
        setIntField(term1083645, term1083645.getClass(), "type", 29);
        setIntField(term1083715, term1083715.getClass(), "type", 29);
        setIntField(term1083785, term1083785.getClass(), "type", 29);
        setIntField(term1083855, term1083855.getClass(), "type", 29);
        setIntField(term1083925, term1083925.getClass(), "type", 29);
        setIntField(term1083995, term1083995.getClass(), "type", 29);
        setIntField(term1084065, term1084065.getClass(), "type", 29);
        setIntField(term1084135, term1084135.getClass(), "type", 29);
        setIntField(term1084205, term1084205.getClass(), "type", 29);
        setIntField(term1084275, term1084275.getClass(), "type", 29);
        setIntField(term1084345, term1084345.getClass(), "type", 29);
        setIntField(term1084415, term1084415.getClass(), "type", 29);
        setIntField(term1084485, term1084485.getClass(), "type", 29);
        setField(term1084485, term1084485.getClass(), "first", term1080985);
        setField(term1084415, term1084415.getClass(), "first", term1084485);
        setField(term1084345, term1084345.getClass(), "first", term1084415);
        setField(term1084275, term1084275.getClass(), "first", term1084345);
        setField(term1084205, term1084205.getClass(), "first", term1084275);
        setField(term1084135, term1084135.getClass(), "first", term1084205);
        setField(term1084065, term1084065.getClass(), "first", term1084135);
        setField(term1083995, term1083995.getClass(), "first", term1084065);
        setField(term1083925, term1083925.getClass(), "first", term1083995);
        setField(term1083855, term1083855.getClass(), "first", term1083925);
        setField(term1083785, term1083785.getClass(), "first", term1083855);
        setField(term1083715, term1083715.getClass(), "first", term1083785);
        setField(term1083645, term1083645.getClass(), "first", term1083715);
        setField(term1083575, term1083575.getClass(), "first", term1083645);
        setField(term1083505, term1083505.getClass(), "first", term1083575);
        setField(term1083435, term1083435.getClass(), "first", term1083505);
        setField(term1083365, term1083365.getClass(), "first", term1083435);
        setField(term1083295, term1083295.getClass(), "first", term1083365);
        setField(term1083225, term1083225.getClass(), "first", term1083295);
        setField(term1083155, term1083155.getClass(), "first", term1083225);
        setField(term1083085, term1083085.getClass(), "first", term1083155);
        setField(term1083015, term1083015.getClass(), "first", term1083085);
        setField(term1082945, term1082945.getClass(), "first", term1083015);
        setField(term1082875, term1082875.getClass(), "first", term1082945);
        setField(term1082805, term1082805.getClass(), "first", term1082875);
        setField(term1082735, term1082735.getClass(), "first", term1082805);
        setField(term1082665, term1082665.getClass(), "first", term1082735);
        setField(term1082595, term1082595.getClass(), "first", term1082665);
        setField(term1082525, term1082525.getClass(), "first", term1082595);
        setField(term1082455, term1082455.getClass(), "first", term1082525);
        setField(term1082385, term1082385.getClass(), "first", term1082455);
        setField(term1082315, term1082315.getClass(), "first", term1082385);
        setField(term1082245, term1082245.getClass(), "first", term1082315);
        setField(term1082175, term1082175.getClass(), "first", term1082245);
        setField(term1082105, term1082105.getClass(), "first", term1082175);
        setField(term1082035, term1082035.getClass(), "first", term1082105);
        setField(term1081965, term1081965.getClass(), "first", term1082035);
        setField(term1081895, term1081895.getClass(), "first", term1081965);
        setField(term1081825, term1081825.getClass(), "first", term1081895);
        setField(term1081755, term1081755.getClass(), "first", term1081825);
        setField(term1081685, term1081685.getClass(), "first", term1081755);
        setField(term1081615, term1081615.getClass(), "first", term1081685);
        setField(term1081545, term1081545.getClass(), "first", term1081615);
        setField(term1081475, term1081475.getClass(), "first", term1081545);
        setField(term1081405, term1081405.getClass(), "first", term1081475);
        setField(term1081335, term1081335.getClass(), "first", term1081405);
        setField(term1081265, term1081265.getClass(), "first", term1081335);
        setField(term1081195, term1081195.getClass(), "first", term1081265);
        setField(term1081125, term1081125.getClass(), "first", term1081195);
        setField(term1081055, term1081055.getClass(), "first", term1081125);
        setField(term1080985, term1080985.getClass(), "first", term1081055);
        setIntField(term1080985, term1080985.getClass(), "type", 17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1080985;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1080915, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


