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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2844081;
     Object term2844151;

    public TypeInference_traverseAdd_838817955505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2844081 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2844151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2844991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2845971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2846951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2847721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2844221, term2844221.getClass(), "next", null);
        setIntField(term2844221, term2844221.getClass(), "type", 14);
        setIntField(term2844291, term2844291.getClass(), "type", 14);
        setIntField(term2844361, term2844361.getClass(), "type", 14);
        setIntField(term2844431, term2844431.getClass(), "type", 14);
        setIntField(term2844501, term2844501.getClass(), "type", 14);
        setIntField(term2844571, term2844571.getClass(), "type", 14);
        setIntField(term2844641, term2844641.getClass(), "type", 14);
        setIntField(term2844711, term2844711.getClass(), "type", 14);
        setIntField(term2844781, term2844781.getClass(), "type", 14);
        setIntField(term2844851, term2844851.getClass(), "type", 14);
        setIntField(term2844921, term2844921.getClass(), "type", 14);
        setIntField(term2844991, term2844991.getClass(), "type", 14);
        setIntField(term2845061, term2845061.getClass(), "type", 14);
        setIntField(term2845131, term2845131.getClass(), "type", 14);
        setIntField(term2845201, term2845201.getClass(), "type", 14);
        setIntField(term2845271, term2845271.getClass(), "type", 14);
        setIntField(term2845341, term2845341.getClass(), "type", 14);
        setIntField(term2845411, term2845411.getClass(), "type", 14);
        setIntField(term2845481, term2845481.getClass(), "type", 14);
        setIntField(term2845551, term2845551.getClass(), "type", 14);
        setIntField(term2845621, term2845621.getClass(), "type", 14);
        setIntField(term2845691, term2845691.getClass(), "type", 14);
        setIntField(term2845761, term2845761.getClass(), "type", 14);
        setIntField(term2845831, term2845831.getClass(), "type", 14);
        setIntField(term2845901, term2845901.getClass(), "type", 14);
        setIntField(term2845971, term2845971.getClass(), "type", 14);
        setIntField(term2846041, term2846041.getClass(), "type", 14);
        setIntField(term2846111, term2846111.getClass(), "type", 14);
        setIntField(term2846181, term2846181.getClass(), "type", 14);
        setIntField(term2846251, term2846251.getClass(), "type", 14);
        setIntField(term2846321, term2846321.getClass(), "type", 14);
        setIntField(term2846391, term2846391.getClass(), "type", 14);
        setIntField(term2846461, term2846461.getClass(), "type", 14);
        setIntField(term2846531, term2846531.getClass(), "type", 14);
        setIntField(term2846601, term2846601.getClass(), "type", 14);
        setIntField(term2846671, term2846671.getClass(), "type", 14);
        setIntField(term2846741, term2846741.getClass(), "type", 14);
        setIntField(term2846811, term2846811.getClass(), "type", 14);
        setIntField(term2846881, term2846881.getClass(), "type", 14);
        setIntField(term2846951, term2846951.getClass(), "type", 14);
        setIntField(term2847021, term2847021.getClass(), "type", 14);
        setIntField(term2847091, term2847091.getClass(), "type", 14);
        setIntField(term2847161, term2847161.getClass(), "type", 14);
        setIntField(term2847231, term2847231.getClass(), "type", 14);
        setIntField(term2847301, term2847301.getClass(), "type", 14);
        setIntField(term2847371, term2847371.getClass(), "type", 14);
        setIntField(term2847441, term2847441.getClass(), "type", 14);
        setIntField(term2847511, term2847511.getClass(), "type", 14);
        setIntField(term2847581, term2847581.getClass(), "type", 14);
        setIntField(term2847651, term2847651.getClass(), "type", 14);
        setIntField(term2847721, term2847721.getClass(), "type", 74);
        setField(term2847651, term2847651.getClass(), "first", term2847721);
        setField(term2847581, term2847581.getClass(), "first", term2847651);
        setField(term2847511, term2847511.getClass(), "first", term2847581);
        setField(term2847441, term2847441.getClass(), "first", term2847511);
        setField(term2847371, term2847371.getClass(), "first", term2847441);
        setField(term2847301, term2847301.getClass(), "first", term2847371);
        setField(term2847231, term2847231.getClass(), "first", term2847301);
        setField(term2847161, term2847161.getClass(), "first", term2847231);
        setField(term2847091, term2847091.getClass(), "first", term2847161);
        setField(term2847021, term2847021.getClass(), "first", term2847091);
        setField(term2846951, term2846951.getClass(), "first", term2847021);
        setField(term2846881, term2846881.getClass(), "first", term2846951);
        setField(term2846811, term2846811.getClass(), "first", term2846881);
        setField(term2846741, term2846741.getClass(), "first", term2846811);
        setField(term2846671, term2846671.getClass(), "first", term2846741);
        setField(term2846601, term2846601.getClass(), "first", term2846671);
        setField(term2846531, term2846531.getClass(), "first", term2846601);
        setField(term2846461, term2846461.getClass(), "first", term2846531);
        setField(term2846391, term2846391.getClass(), "first", term2846461);
        setField(term2846321, term2846321.getClass(), "first", term2846391);
        setField(term2846251, term2846251.getClass(), "first", term2846321);
        setField(term2846181, term2846181.getClass(), "first", term2846251);
        setField(term2846111, term2846111.getClass(), "first", term2846181);
        setField(term2846041, term2846041.getClass(), "first", term2846111);
        setField(term2845971, term2845971.getClass(), "first", term2846041);
        setField(term2845901, term2845901.getClass(), "first", term2845971);
        setField(term2845831, term2845831.getClass(), "first", term2845901);
        setField(term2845761, term2845761.getClass(), "first", term2845831);
        setField(term2845691, term2845691.getClass(), "first", term2845761);
        setField(term2845621, term2845621.getClass(), "first", term2845691);
        setField(term2845551, term2845551.getClass(), "first", term2845621);
        setField(term2845481, term2845481.getClass(), "first", term2845551);
        setField(term2845411, term2845411.getClass(), "first", term2845481);
        setField(term2845341, term2845341.getClass(), "first", term2845411);
        setField(term2845271, term2845271.getClass(), "first", term2845341);
        setField(term2845201, term2845201.getClass(), "first", term2845271);
        setField(term2845131, term2845131.getClass(), "first", term2845201);
        setField(term2845061, term2845061.getClass(), "first", term2845131);
        setField(term2844991, term2844991.getClass(), "first", term2845061);
        setField(term2844921, term2844921.getClass(), "first", term2844991);
        setField(term2844851, term2844851.getClass(), "first", term2844921);
        setField(term2844781, term2844781.getClass(), "first", term2844851);
        setField(term2844711, term2844711.getClass(), "first", term2844781);
        setField(term2844641, term2844641.getClass(), "first", term2844711);
        setField(term2844571, term2844571.getClass(), "first", term2844641);
        setField(term2844501, term2844501.getClass(), "first", term2844571);
        setField(term2844431, term2844431.getClass(), "first", term2844501);
        setField(term2844361, term2844361.getClass(), "first", term2844431);
        setField(term2844291, term2844291.getClass(), "first", term2844361);
        setField(term2844221, term2844221.getClass(), "first", term2844291);
        setField(term2844151, term2844151.getClass(), "first", term2844221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2844151;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term2844081, args);
    }

};


