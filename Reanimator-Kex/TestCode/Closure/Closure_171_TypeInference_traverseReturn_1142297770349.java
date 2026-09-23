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

public class TypeInference_traverseReturn_1142297770349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856585;
     Object term856655;

    public TypeInference_traverseReturn_1142297770349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856585 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term856655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term859945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term860225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term856725, term856725.getClass(), "type", 29);
        setIntField(term856795, term856795.getClass(), "type", 29);
        setIntField(term856865, term856865.getClass(), "type", 29);
        setIntField(term856935, term856935.getClass(), "type", 29);
        setIntField(term857005, term857005.getClass(), "type", 29);
        setIntField(term857075, term857075.getClass(), "type", 29);
        setIntField(term857145, term857145.getClass(), "type", 29);
        setIntField(term857215, term857215.getClass(), "type", 29);
        setIntField(term857285, term857285.getClass(), "type", 29);
        setIntField(term857355, term857355.getClass(), "type", 29);
        setIntField(term857425, term857425.getClass(), "type", 29);
        setIntField(term857495, term857495.getClass(), "type", 29);
        setIntField(term857565, term857565.getClass(), "type", 29);
        setIntField(term857635, term857635.getClass(), "type", 29);
        setIntField(term857705, term857705.getClass(), "type", 29);
        setIntField(term857775, term857775.getClass(), "type", 29);
        setIntField(term857845, term857845.getClass(), "type", 29);
        setIntField(term857915, term857915.getClass(), "type", 29);
        setIntField(term857985, term857985.getClass(), "type", 29);
        setIntField(term858055, term858055.getClass(), "type", 29);
        setIntField(term858125, term858125.getClass(), "type", 29);
        setIntField(term858195, term858195.getClass(), "type", 29);
        setIntField(term858265, term858265.getClass(), "type", 29);
        setIntField(term858335, term858335.getClass(), "type", 29);
        setIntField(term858405, term858405.getClass(), "type", 29);
        setIntField(term858475, term858475.getClass(), "type", 29);
        setIntField(term858545, term858545.getClass(), "type", 29);
        setIntField(term858615, term858615.getClass(), "type", 29);
        setIntField(term858685, term858685.getClass(), "type", 29);
        setIntField(term858755, term858755.getClass(), "type", 29);
        setIntField(term858825, term858825.getClass(), "type", 29);
        setIntField(term858895, term858895.getClass(), "type", 29);
        setIntField(term858965, term858965.getClass(), "type", 29);
        setIntField(term859035, term859035.getClass(), "type", 29);
        setIntField(term859105, term859105.getClass(), "type", 29);
        setIntField(term859175, term859175.getClass(), "type", 29);
        setIntField(term859245, term859245.getClass(), "type", 29);
        setIntField(term859315, term859315.getClass(), "type", 29);
        setIntField(term859385, term859385.getClass(), "type", 29);
        setIntField(term859455, term859455.getClass(), "type", 29);
        setIntField(term859525, term859525.getClass(), "type", 29);
        setIntField(term859595, term859595.getClass(), "type", 29);
        setIntField(term859665, term859665.getClass(), "type", 29);
        setIntField(term859735, term859735.getClass(), "type", 29);
        setIntField(term859805, term859805.getClass(), "type", 29);
        setIntField(term859875, term859875.getClass(), "type", 29);
        setIntField(term859945, term859945.getClass(), "type", 29);
        setIntField(term860015, term860015.getClass(), "type", 29);
        setIntField(term860085, term860085.getClass(), "type", 29);
        setIntField(term860155, term860155.getClass(), "type", 29);
        setIntField(term860225, term860225.getClass(), "type", 112);
        setField(term860155, term860155.getClass(), "first", term860225);
        setField(term860085, term860085.getClass(), "first", term860155);
        setField(term860015, term860015.getClass(), "first", term860085);
        setField(term859945, term859945.getClass(), "first", term860015);
        setField(term859875, term859875.getClass(), "first", term859945);
        setField(term859805, term859805.getClass(), "first", term859875);
        setField(term859735, term859735.getClass(), "first", term859805);
        setField(term859665, term859665.getClass(), "first", term859735);
        setField(term859595, term859595.getClass(), "first", term859665);
        setField(term859525, term859525.getClass(), "first", term859595);
        setField(term859455, term859455.getClass(), "first", term859525);
        setField(term859385, term859385.getClass(), "first", term859455);
        setField(term859315, term859315.getClass(), "first", term859385);
        setField(term859245, term859245.getClass(), "first", term859315);
        setField(term859175, term859175.getClass(), "first", term859245);
        setField(term859105, term859105.getClass(), "first", term859175);
        setField(term859035, term859035.getClass(), "first", term859105);
        setField(term858965, term858965.getClass(), "first", term859035);
        setField(term858895, term858895.getClass(), "first", term858965);
        setField(term858825, term858825.getClass(), "first", term858895);
        setField(term858755, term858755.getClass(), "first", term858825);
        setField(term858685, term858685.getClass(), "first", term858755);
        setField(term858615, term858615.getClass(), "first", term858685);
        setField(term858545, term858545.getClass(), "first", term858615);
        setField(term858475, term858475.getClass(), "first", term858545);
        setField(term858405, term858405.getClass(), "first", term858475);
        setField(term858335, term858335.getClass(), "first", term858405);
        setField(term858265, term858265.getClass(), "first", term858335);
        setField(term858195, term858195.getClass(), "first", term858265);
        setField(term858125, term858125.getClass(), "first", term858195);
        setField(term858055, term858055.getClass(), "first", term858125);
        setField(term857985, term857985.getClass(), "first", term858055);
        setField(term857915, term857915.getClass(), "first", term857985);
        setField(term857845, term857845.getClass(), "first", term857915);
        setField(term857775, term857775.getClass(), "first", term857845);
        setField(term857705, term857705.getClass(), "first", term857775);
        setField(term857635, term857635.getClass(), "first", term857705);
        setField(term857565, term857565.getClass(), "first", term857635);
        setField(term857495, term857495.getClass(), "first", term857565);
        setField(term857425, term857425.getClass(), "first", term857495);
        setField(term857355, term857355.getClass(), "first", term857425);
        setField(term857285, term857285.getClass(), "first", term857355);
        setField(term857215, term857215.getClass(), "first", term857285);
        setField(term857145, term857145.getClass(), "first", term857215);
        setField(term857075, term857075.getClass(), "first", term857145);
        setField(term857005, term857005.getClass(), "first", term857075);
        setField(term856935, term856935.getClass(), "first", term857005);
        setField(term856865, term856865.getClass(), "first", term856935);
        setField(term856795, term856795.getClass(), "first", term856865);
        setField(term856725, term856725.getClass(), "first", term856795);
        setField(term856655, term856655.getClass(), "first", term856725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term856655;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term856585, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


