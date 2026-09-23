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

public class TypeInference_traverseReturn_1142297770262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364905;
     Object term364975;

    public TypeInference_traverseReturn_1142297770262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364905 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term364975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term365045, term365045.getClass(), "type", 29);
        setIntField(term365115, term365115.getClass(), "type", 29);
        setIntField(term365185, term365185.getClass(), "type", 29);
        setIntField(term365255, term365255.getClass(), "type", 29);
        setIntField(term365325, term365325.getClass(), "type", 29);
        setIntField(term365395, term365395.getClass(), "type", 29);
        setIntField(term365465, term365465.getClass(), "type", 29);
        setIntField(term365535, term365535.getClass(), "type", 29);
        setIntField(term365605, term365605.getClass(), "type", 29);
        setIntField(term365675, term365675.getClass(), "type", 29);
        setIntField(term365745, term365745.getClass(), "type", 29);
        setIntField(term365815, term365815.getClass(), "type", 29);
        setIntField(term365885, term365885.getClass(), "type", 29);
        setIntField(term365955, term365955.getClass(), "type", 29);
        setIntField(term366025, term366025.getClass(), "type", 29);
        setIntField(term366095, term366095.getClass(), "type", 29);
        setIntField(term366165, term366165.getClass(), "type", 29);
        setIntField(term366235, term366235.getClass(), "type", 29);
        setIntField(term366305, term366305.getClass(), "type", 29);
        setIntField(term366375, term366375.getClass(), "type", 29);
        setIntField(term366445, term366445.getClass(), "type", 29);
        setIntField(term366515, term366515.getClass(), "type", 29);
        setIntField(term366585, term366585.getClass(), "type", 29);
        setIntField(term366655, term366655.getClass(), "type", 29);
        setIntField(term366725, term366725.getClass(), "type", 29);
        setIntField(term366795, term366795.getClass(), "type", 29);
        setIntField(term366865, term366865.getClass(), "type", 29);
        setIntField(term366935, term366935.getClass(), "type", 29);
        setIntField(term367005, term367005.getClass(), "type", 29);
        setIntField(term367075, term367075.getClass(), "type", 29);
        setIntField(term367145, term367145.getClass(), "type", 29);
        setIntField(term367215, term367215.getClass(), "type", 29);
        setIntField(term367285, term367285.getClass(), "type", 29);
        setIntField(term367355, term367355.getClass(), "type", 29);
        setIntField(term367425, term367425.getClass(), "type", 29);
        setIntField(term367495, term367495.getClass(), "type", 29);
        setIntField(term367565, term367565.getClass(), "type", 29);
        setIntField(term367635, term367635.getClass(), "type", 29);
        setIntField(term367705, term367705.getClass(), "type", 29);
        setIntField(term367775, term367775.getClass(), "type", 29);
        setIntField(term367845, term367845.getClass(), "type", 29);
        setIntField(term367915, term367915.getClass(), "type", 29);
        setIntField(term367985, term367985.getClass(), "type", 29);
        setIntField(term368055, term368055.getClass(), "type", 29);
        setIntField(term368125, term368125.getClass(), "type", 29);
        setIntField(term368195, term368195.getClass(), "type", 29);
        setIntField(term368265, term368265.getClass(), "type", 29);
        setIntField(term368335, term368335.getClass(), "type", 29);
        setIntField(term368405, term368405.getClass(), "type", 29);
        setIntField(term368475, term368475.getClass(), "type", 29);
        setIntField(term368545, term368545.getClass(), "type", 29);
        setIntField(term368615, term368615.getClass(), "type", 29);
        setIntField(term368685, term368685.getClass(), "type", 29);
        setIntField(term368755, term368755.getClass(), "type", 29);
        setIntField(term368825, term368825.getClass(), "type", 29);
        setIntField(term368895, term368895.getClass(), "type", 29);
        setIntField(term368965, term368965.getClass(), "type", 29);
        setIntField(term369035, term369035.getClass(), "type", 29);
        setIntField(term369105, term369105.getClass(), "type", 29);
        setIntField(term369175, term369175.getClass(), "type", 29);
        setIntField(term369245, term369245.getClass(), "type", 29);
        setIntField(term369315, term369315.getClass(), "type", 29);
        setIntField(term369385, term369385.getClass(), "type", 29);
        setIntField(term369455, term369455.getClass(), "type", 29);
        setIntField(term369525, term369525.getClass(), "type", 122);
        setField(term369455, term369455.getClass(), "first", term369525);
        setField(term369385, term369385.getClass(), "first", term369455);
        setField(term369315, term369315.getClass(), "first", term369385);
        setField(term369245, term369245.getClass(), "first", term369315);
        setField(term369175, term369175.getClass(), "first", term369245);
        setField(term369105, term369105.getClass(), "first", term369175);
        setField(term369035, term369035.getClass(), "first", term369105);
        setField(term368965, term368965.getClass(), "first", term369035);
        setField(term368895, term368895.getClass(), "first", term368965);
        setField(term368825, term368825.getClass(), "first", term368895);
        setField(term368755, term368755.getClass(), "first", term368825);
        setField(term368685, term368685.getClass(), "first", term368755);
        setField(term368615, term368615.getClass(), "first", term368685);
        setField(term368545, term368545.getClass(), "first", term368615);
        setField(term368475, term368475.getClass(), "first", term368545);
        setField(term368405, term368405.getClass(), "first", term368475);
        setField(term368335, term368335.getClass(), "first", term368405);
        setField(term368265, term368265.getClass(), "first", term368335);
        setField(term368195, term368195.getClass(), "first", term368265);
        setField(term368125, term368125.getClass(), "first", term368195);
        setField(term368055, term368055.getClass(), "first", term368125);
        setField(term367985, term367985.getClass(), "first", term368055);
        setField(term367915, term367915.getClass(), "first", term367985);
        setField(term367845, term367845.getClass(), "first", term367915);
        setField(term367775, term367775.getClass(), "first", term367845);
        setField(term367705, term367705.getClass(), "first", term367775);
        setField(term367635, term367635.getClass(), "first", term367705);
        setField(term367565, term367565.getClass(), "first", term367635);
        setField(term367495, term367495.getClass(), "first", term367565);
        setField(term367425, term367425.getClass(), "first", term367495);
        setField(term367355, term367355.getClass(), "first", term367425);
        setField(term367285, term367285.getClass(), "first", term367355);
        setField(term367215, term367215.getClass(), "first", term367285);
        setField(term367145, term367145.getClass(), "first", term367215);
        setField(term367075, term367075.getClass(), "first", term367145);
        setField(term367005, term367005.getClass(), "first", term367075);
        setField(term366935, term366935.getClass(), "first", term367005);
        setField(term366865, term366865.getClass(), "first", term366935);
        setField(term366795, term366795.getClass(), "first", term366865);
        setField(term366725, term366725.getClass(), "first", term366795);
        setField(term366655, term366655.getClass(), "first", term366725);
        setField(term366585, term366585.getClass(), "first", term366655);
        setField(term366515, term366515.getClass(), "first", term366585);
        setField(term366445, term366445.getClass(), "first", term366515);
        setField(term366375, term366375.getClass(), "first", term366445);
        setField(term366305, term366305.getClass(), "first", term366375);
        setField(term366235, term366235.getClass(), "first", term366305);
        setField(term366165, term366165.getClass(), "first", term366235);
        setField(term366095, term366095.getClass(), "first", term366165);
        setField(term366025, term366025.getClass(), "first", term366095);
        setField(term365955, term365955.getClass(), "first", term366025);
        setField(term365885, term365885.getClass(), "first", term365955);
        setField(term365815, term365815.getClass(), "first", term365885);
        setField(term365745, term365745.getClass(), "first", term365815);
        setField(term365675, term365675.getClass(), "first", term365745);
        setField(term365605, term365605.getClass(), "first", term365675);
        setField(term365535, term365535.getClass(), "first", term365605);
        setField(term365465, term365465.getClass(), "first", term365535);
        setField(term365395, term365395.getClass(), "first", term365465);
        setField(term365325, term365325.getClass(), "first", term365395);
        setField(term365255, term365255.getClass(), "first", term365325);
        setField(term365185, term365185.getClass(), "first", term365255);
        setField(term365115, term365115.getClass(), "first", term365185);
        setField(term365045, term365045.getClass(), "first", term365115);
        setField(term364975, term364975.getClass(), "first", term365045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term364975;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term364905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


