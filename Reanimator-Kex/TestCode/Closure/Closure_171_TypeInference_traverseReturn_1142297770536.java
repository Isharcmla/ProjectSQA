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

public class TypeInference_traverseReturn_1142297770536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1700124;
     Object term1700194;

    public TypeInference_traverseReturn_1142297770536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1700124 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1700194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1700264, term1700264.getClass(), "type", 92);
        setIntField(term1700334, term1700334.getClass(), "type", 92);
        setIntField(term1700404, term1700404.getClass(), "type", 92);
        setIntField(term1700474, term1700474.getClass(), "type", 92);
        setIntField(term1700544, term1700544.getClass(), "type", 92);
        setIntField(term1700614, term1700614.getClass(), "type", 92);
        setIntField(term1700684, term1700684.getClass(), "type", 92);
        setIntField(term1700754, term1700754.getClass(), "type", 92);
        setIntField(term1700824, term1700824.getClass(), "type", 92);
        setIntField(term1700894, term1700894.getClass(), "type", 92);
        setIntField(term1700964, term1700964.getClass(), "type", 92);
        setIntField(term1701034, term1701034.getClass(), "type", 92);
        setIntField(term1701104, term1701104.getClass(), "type", 92);
        setIntField(term1701174, term1701174.getClass(), "type", 92);
        setIntField(term1701244, term1701244.getClass(), "type", 92);
        setIntField(term1701314, term1701314.getClass(), "type", 92);
        setIntField(term1701384, term1701384.getClass(), "type", 92);
        setIntField(term1701454, term1701454.getClass(), "type", 92);
        setIntField(term1701524, term1701524.getClass(), "type", 92);
        setIntField(term1701594, term1701594.getClass(), "type", 92);
        setIntField(term1701664, term1701664.getClass(), "type", 92);
        setIntField(term1701734, term1701734.getClass(), "type", 92);
        setIntField(term1701804, term1701804.getClass(), "type", 92);
        setIntField(term1701874, term1701874.getClass(), "type", 92);
        setIntField(term1701944, term1701944.getClass(), "type", 92);
        setIntField(term1702014, term1702014.getClass(), "type", 92);
        setIntField(term1702084, term1702084.getClass(), "type", 92);
        setIntField(term1702154, term1702154.getClass(), "type", 92);
        setIntField(term1702224, term1702224.getClass(), "type", 92);
        setIntField(term1702294, term1702294.getClass(), "type", 92);
        setIntField(term1702364, term1702364.getClass(), "type", 92);
        setIntField(term1702434, term1702434.getClass(), "type", 92);
        setIntField(term1702504, term1702504.getClass(), "type", 92);
        setIntField(term1702574, term1702574.getClass(), "type", 92);
        setIntField(term1702644, term1702644.getClass(), "type", 92);
        setIntField(term1702714, term1702714.getClass(), "type", 92);
        setIntField(term1702784, term1702784.getClass(), "type", 92);
        setIntField(term1702854, term1702854.getClass(), "type", 92);
        setIntField(term1702924, term1702924.getClass(), "type", 92);
        setIntField(term1702994, term1702994.getClass(), "type", 92);
        setIntField(term1703064, term1703064.getClass(), "type", 92);
        setIntField(term1703134, term1703134.getClass(), "type", 92);
        setIntField(term1703204, term1703204.getClass(), "type", 92);
        setIntField(term1703274, term1703274.getClass(), "type", 92);
        setIntField(term1703344, term1703344.getClass(), "type", 92);
        setIntField(term1703414, term1703414.getClass(), "type", 92);
        setIntField(term1703484, term1703484.getClass(), "type", 92);
        setIntField(term1703554, term1703554.getClass(), "type", 92);
        setIntField(term1703624, term1703624.getClass(), "type", 92);
        setIntField(term1703694, term1703694.getClass(), "type", 92);
        setIntField(term1703764, term1703764.getClass(), "type", 92);
        setIntField(term1703834, term1703834.getClass(), "type", 92);
        setIntField(term1703904, term1703904.getClass(), "type", 92);
        setIntField(term1703974, term1703974.getClass(), "type", 92);
        setIntField(term1704044, term1704044.getClass(), "type", 92);
        setIntField(term1704114, term1704114.getClass(), "type", 92);
        setIntField(term1704184, term1704184.getClass(), "type", 39);
        setField(term1704114, term1704114.getClass(), "first", term1704184);
        setField(term1704044, term1704044.getClass(), "first", term1704114);
        setField(term1703974, term1703974.getClass(), "first", term1704044);
        setField(term1703904, term1703904.getClass(), "first", term1703974);
        setField(term1703834, term1703834.getClass(), "first", term1703904);
        setField(term1703764, term1703764.getClass(), "first", term1703834);
        setField(term1703694, term1703694.getClass(), "first", term1703764);
        setField(term1703624, term1703624.getClass(), "first", term1703694);
        setField(term1703554, term1703554.getClass(), "first", term1703624);
        setField(term1703484, term1703484.getClass(), "first", term1703554);
        setField(term1703414, term1703414.getClass(), "first", term1703484);
        setField(term1703344, term1703344.getClass(), "first", term1703414);
        setField(term1703274, term1703274.getClass(), "first", term1703344);
        setField(term1703204, term1703204.getClass(), "first", term1703274);
        setField(term1703134, term1703134.getClass(), "first", term1703204);
        setField(term1703064, term1703064.getClass(), "first", term1703134);
        setField(term1702994, term1702994.getClass(), "first", term1703064);
        setField(term1702924, term1702924.getClass(), "first", term1702994);
        setField(term1702854, term1702854.getClass(), "first", term1702924);
        setField(term1702784, term1702784.getClass(), "first", term1702854);
        setField(term1702714, term1702714.getClass(), "first", term1702784);
        setField(term1702644, term1702644.getClass(), "first", term1702714);
        setField(term1702574, term1702574.getClass(), "first", term1702644);
        setField(term1702504, term1702504.getClass(), "first", term1702574);
        setField(term1702434, term1702434.getClass(), "first", term1702504);
        setField(term1702364, term1702364.getClass(), "first", term1702434);
        setField(term1702294, term1702294.getClass(), "first", term1702364);
        setField(term1702224, term1702224.getClass(), "first", term1702294);
        setField(term1702154, term1702154.getClass(), "first", term1702224);
        setField(term1702084, term1702084.getClass(), "first", term1702154);
        setField(term1702014, term1702014.getClass(), "first", term1702084);
        setField(term1701944, term1701944.getClass(), "first", term1702014);
        setField(term1701874, term1701874.getClass(), "first", term1701944);
        setField(term1701804, term1701804.getClass(), "first", term1701874);
        setField(term1701734, term1701734.getClass(), "first", term1701804);
        setField(term1701664, term1701664.getClass(), "first", term1701734);
        setField(term1701594, term1701594.getClass(), "first", term1701664);
        setField(term1701524, term1701524.getClass(), "first", term1701594);
        setField(term1701454, term1701454.getClass(), "first", term1701524);
        setField(term1701384, term1701384.getClass(), "first", term1701454);
        setField(term1701314, term1701314.getClass(), "first", term1701384);
        setField(term1701244, term1701244.getClass(), "first", term1701314);
        setField(term1701174, term1701174.getClass(), "first", term1701244);
        setField(term1701104, term1701104.getClass(), "first", term1701174);
        setField(term1701034, term1701034.getClass(), "first", term1701104);
        setField(term1700964, term1700964.getClass(), "first", term1701034);
        setField(term1700894, term1700894.getClass(), "first", term1700964);
        setField(term1700824, term1700824.getClass(), "first", term1700894);
        setField(term1700754, term1700754.getClass(), "first", term1700824);
        setField(term1700684, term1700684.getClass(), "first", term1700754);
        setField(term1700614, term1700614.getClass(), "first", term1700684);
        setField(term1700544, term1700544.getClass(), "first", term1700614);
        setField(term1700474, term1700474.getClass(), "first", term1700544);
        setField(term1700404, term1700404.getClass(), "first", term1700474);
        setField(term1700334, term1700334.getClass(), "first", term1700404);
        setField(term1700264, term1700264.getClass(), "first", term1700334);
        setField(term1700194, term1700194.getClass(), "first", term1700264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1700194;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1700124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


