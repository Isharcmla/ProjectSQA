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

public class TypeInference_traverseChildren_1478920219259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455405;
     Object term455475;

    public TypeInference_traverseChildren_1478920219259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455405 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term455475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term455545, term455545.getClass(), "type", 18);
        setIntField(term455615, term455615.getClass(), "type", 18);
        setIntField(term455685, term455685.getClass(), "type", 18);
        setIntField(term455755, term455755.getClass(), "type", 18);
        setIntField(term455825, term455825.getClass(), "type", 18);
        setIntField(term455895, term455895.getClass(), "type", 18);
        setIntField(term455965, term455965.getClass(), "type", 18);
        setIntField(term456035, term456035.getClass(), "type", 18);
        setIntField(term456105, term456105.getClass(), "type", 18);
        setIntField(term456175, term456175.getClass(), "type", 18);
        setIntField(term456245, term456245.getClass(), "type", 18);
        setIntField(term456315, term456315.getClass(), "type", 18);
        setIntField(term456385, term456385.getClass(), "type", 18);
        setIntField(term456455, term456455.getClass(), "type", 18);
        setIntField(term456525, term456525.getClass(), "type", 18);
        setIntField(term456595, term456595.getClass(), "type", 18);
        setIntField(term456665, term456665.getClass(), "type", 18);
        setIntField(term456735, term456735.getClass(), "type", 18);
        setIntField(term456805, term456805.getClass(), "type", 18);
        setIntField(term456875, term456875.getClass(), "type", 18);
        setIntField(term456945, term456945.getClass(), "type", 18);
        setIntField(term457015, term457015.getClass(), "type", 18);
        setIntField(term457085, term457085.getClass(), "type", 18);
        setIntField(term457155, term457155.getClass(), "type", 18);
        setIntField(term457225, term457225.getClass(), "type", 18);
        setIntField(term457295, term457295.getClass(), "type", 18);
        setIntField(term457365, term457365.getClass(), "type", 18);
        setIntField(term457435, term457435.getClass(), "type", 18);
        setIntField(term457505, term457505.getClass(), "type", 18);
        setIntField(term457575, term457575.getClass(), "type", 18);
        setIntField(term457645, term457645.getClass(), "type", 18);
        setIntField(term457715, term457715.getClass(), "type", 18);
        setIntField(term457785, term457785.getClass(), "type", 18);
        setIntField(term457855, term457855.getClass(), "type", 18);
        setIntField(term457925, term457925.getClass(), "type", 18);
        setIntField(term457995, term457995.getClass(), "type", 18);
        setIntField(term458065, term458065.getClass(), "type", 18);
        setIntField(term458135, term458135.getClass(), "type", 18);
        setIntField(term458205, term458205.getClass(), "type", 18);
        setIntField(term458275, term458275.getClass(), "type", 18);
        setIntField(term458345, term458345.getClass(), "type", 18);
        setIntField(term458415, term458415.getClass(), "type", 18);
        setIntField(term458485, term458485.getClass(), "type", 18);
        setIntField(term458555, term458555.getClass(), "type", 18);
        setIntField(term458625, term458625.getClass(), "type", 18);
        setIntField(term458695, term458695.getClass(), "type", 18);
        setIntField(term458765, term458765.getClass(), "type", 18);
        setIntField(term458835, term458835.getClass(), "type", 18);
        setIntField(term458905, term458905.getClass(), "type", 18);
        setIntField(term458975, term458975.getClass(), "type", 18);
        setIntField(term459045, term459045.getClass(), "type", 18);
        setIntField(term459115, term459115.getClass(), "type", 18);
        setIntField(term459185, term459185.getClass(), "type", 18);
        setIntField(term459255, term459255.getClass(), "type", 18);
        setIntField(term459325, term459325.getClass(), "type", 18);
        setIntField(term459395, term459395.getClass(), "type", 18);
        setIntField(term459465, term459465.getClass(), "type", 18);
        setIntField(term459535, term459535.getClass(), "type", 18);
        setIntField(term459605, term459605.getClass(), "type", 18);
        setIntField(term459675, term459675.getClass(), "type", 18);
        setIntField(term459745, term459745.getClass(), "type", 18);
        setIntField(term459815, term459815.getClass(), "type", 18);
        setIntField(term459885, term459885.getClass(), "type", 18);
        setIntField(term459955, term459955.getClass(), "type", 18);
        setIntField(term460025, term460025.getClass(), "type", 18);
        setIntField(term460095, term460095.getClass(), "type", 110);
        setField(term460025, term460025.getClass(), "first", term460095);
        setField(term459955, term459955.getClass(), "first", term460025);
        setField(term459885, term459885.getClass(), "first", term459955);
        setField(term459815, term459815.getClass(), "first", term459885);
        setField(term459745, term459745.getClass(), "first", term459815);
        setField(term459675, term459675.getClass(), "first", term459745);
        setField(term459605, term459605.getClass(), "first", term459675);
        setField(term459535, term459535.getClass(), "first", term459605);
        setField(term459465, term459465.getClass(), "first", term459535);
        setField(term459395, term459395.getClass(), "first", term459465);
        setField(term459325, term459325.getClass(), "first", term459395);
        setField(term459255, term459255.getClass(), "first", term459325);
        setField(term459185, term459185.getClass(), "first", term459255);
        setField(term459115, term459115.getClass(), "first", term459185);
        setField(term459045, term459045.getClass(), "first", term459115);
        setField(term458975, term458975.getClass(), "first", term459045);
        setField(term458905, term458905.getClass(), "first", term458975);
        setField(term458835, term458835.getClass(), "first", term458905);
        setField(term458765, term458765.getClass(), "first", term458835);
        setField(term458695, term458695.getClass(), "first", term458765);
        setField(term458625, term458625.getClass(), "first", term458695);
        setField(term458555, term458555.getClass(), "first", term458625);
        setField(term458485, term458485.getClass(), "first", term458555);
        setField(term458415, term458415.getClass(), "first", term458485);
        setField(term458345, term458345.getClass(), "first", term458415);
        setField(term458275, term458275.getClass(), "first", term458345);
        setField(term458205, term458205.getClass(), "first", term458275);
        setField(term458135, term458135.getClass(), "first", term458205);
        setField(term458065, term458065.getClass(), "first", term458135);
        setField(term457995, term457995.getClass(), "first", term458065);
        setField(term457925, term457925.getClass(), "first", term457995);
        setField(term457855, term457855.getClass(), "first", term457925);
        setField(term457785, term457785.getClass(), "first", term457855);
        setField(term457715, term457715.getClass(), "first", term457785);
        setField(term457645, term457645.getClass(), "first", term457715);
        setField(term457575, term457575.getClass(), "first", term457645);
        setField(term457505, term457505.getClass(), "first", term457575);
        setField(term457435, term457435.getClass(), "first", term457505);
        setField(term457365, term457365.getClass(), "first", term457435);
        setField(term457295, term457295.getClass(), "first", term457365);
        setField(term457225, term457225.getClass(), "first", term457295);
        setField(term457155, term457155.getClass(), "first", term457225);
        setField(term457085, term457085.getClass(), "first", term457155);
        setField(term457015, term457015.getClass(), "first", term457085);
        setField(term456945, term456945.getClass(), "first", term457015);
        setField(term456875, term456875.getClass(), "first", term456945);
        setField(term456805, term456805.getClass(), "first", term456875);
        setField(term456735, term456735.getClass(), "first", term456805);
        setField(term456665, term456665.getClass(), "first", term456735);
        setField(term456595, term456595.getClass(), "first", term456665);
        setField(term456525, term456525.getClass(), "first", term456595);
        setField(term456455, term456455.getClass(), "first", term456525);
        setField(term456385, term456385.getClass(), "first", term456455);
        setField(term456315, term456315.getClass(), "first", term456385);
        setField(term456245, term456245.getClass(), "first", term456315);
        setField(term456175, term456175.getClass(), "first", term456245);
        setField(term456105, term456105.getClass(), "first", term456175);
        setField(term456035, term456035.getClass(), "first", term456105);
        setField(term455965, term455965.getClass(), "first", term456035);
        setField(term455895, term455895.getClass(), "first", term455965);
        setField(term455825, term455825.getClass(), "first", term455895);
        setField(term455755, term455755.getClass(), "first", term455825);
        setField(term455685, term455685.getClass(), "first", term455755);
        setField(term455615, term455615.getClass(), "first", term455685);
        setField(term455545, term455545.getClass(), "first", term455615);
        setField(term455475, term455475.getClass(), "first", term455545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term455475;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term455405, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


