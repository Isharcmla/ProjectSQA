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

public class TypeInference_traverseReturn_1142297770384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970936;
     Object term971006;

    public TypeInference_traverseReturn_1142297770384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term970936 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term971006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term973946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term971076, term971076.getClass(), "type", 29);
        setIntField(term971146, term971146.getClass(), "type", 29);
        setIntField(term971216, term971216.getClass(), "type", 29);
        setIntField(term971286, term971286.getClass(), "type", 29);
        setIntField(term971356, term971356.getClass(), "type", 29);
        setIntField(term971426, term971426.getClass(), "type", 29);
        setIntField(term971496, term971496.getClass(), "type", 29);
        setIntField(term971566, term971566.getClass(), "type", 29);
        setIntField(term971636, term971636.getClass(), "type", 29);
        setIntField(term971706, term971706.getClass(), "type", 29);
        setIntField(term971776, term971776.getClass(), "type", 29);
        setIntField(term971846, term971846.getClass(), "type", 29);
        setIntField(term971916, term971916.getClass(), "type", 29);
        setIntField(term971986, term971986.getClass(), "type", 29);
        setIntField(term972056, term972056.getClass(), "type", 29);
        setIntField(term972126, term972126.getClass(), "type", 29);
        setIntField(term972196, term972196.getClass(), "type", 29);
        setIntField(term972266, term972266.getClass(), "type", 29);
        setIntField(term972336, term972336.getClass(), "type", 29);
        setIntField(term972406, term972406.getClass(), "type", 29);
        setIntField(term972476, term972476.getClass(), "type", 29);
        setIntField(term972546, term972546.getClass(), "type", 29);
        setIntField(term972616, term972616.getClass(), "type", 29);
        setIntField(term972686, term972686.getClass(), "type", 29);
        setIntField(term972756, term972756.getClass(), "type", 29);
        setIntField(term972826, term972826.getClass(), "type", 29);
        setIntField(term972896, term972896.getClass(), "type", 29);
        setIntField(term972966, term972966.getClass(), "type", 29);
        setIntField(term973036, term973036.getClass(), "type", 29);
        setIntField(term973106, term973106.getClass(), "type", 29);
        setIntField(term973176, term973176.getClass(), "type", 29);
        setIntField(term973246, term973246.getClass(), "type", 29);
        setIntField(term973316, term973316.getClass(), "type", 29);
        setIntField(term973386, term973386.getClass(), "type", 29);
        setIntField(term973456, term973456.getClass(), "type", 29);
        setIntField(term973526, term973526.getClass(), "type", 29);
        setIntField(term973596, term973596.getClass(), "type", 29);
        setIntField(term973666, term973666.getClass(), "type", 29);
        setIntField(term973736, term973736.getClass(), "type", 29);
        setIntField(term973806, term973806.getClass(), "type", 29);
        setIntField(term973876, term973876.getClass(), "type", 29);
        setIntField(term973946, term973946.getClass(), "type", 29);
        setIntField(term974016, term974016.getClass(), "type", 29);
        setIntField(term974086, term974086.getClass(), "type", 29);
        setIntField(term974156, term974156.getClass(), "type", 29);
        setIntField(term974226, term974226.getClass(), "type", 29);
        setIntField(term974296, term974296.getClass(), "type", 29);
        setIntField(term974366, term974366.getClass(), "type", 29);
        setIntField(term974436, term974436.getClass(), "type", 29);
        setIntField(term974506, term974506.getClass(), "type", 29);
        setIntField(term974576, term974576.getClass(), "type", 29);
        setIntField(term974646, term974646.getClass(), "type", 29);
        setIntField(term974716, term974716.getClass(), "type", 29);
        setIntField(term974786, term974786.getClass(), "type", 29);
        setIntField(term974856, term974856.getClass(), "type", 29);
        setIntField(term974926, term974926.getClass(), "type", 29);
        setIntField(term974996, term974996.getClass(), "type", 29);
        setIntField(term975066, term975066.getClass(), "type", 29);
        setIntField(term975136, term975136.getClass(), "type", 29);
        setIntField(term975206, term975206.getClass(), "type", 29);
        setIntField(term975276, term975276.getClass(), "type", 29);
        setIntField(term975346, term975346.getClass(), "type", 29);
        setIntField(term975416, term975416.getClass(), "type", 121);
        setField(term975346, term975346.getClass(), "first", term975416);
        setField(term975276, term975276.getClass(), "first", term975346);
        setField(term975206, term975206.getClass(), "first", term975276);
        setField(term975136, term975136.getClass(), "first", term975206);
        setField(term975066, term975066.getClass(), "first", term975136);
        setField(term974996, term974996.getClass(), "first", term975066);
        setField(term974926, term974926.getClass(), "first", term974996);
        setField(term974856, term974856.getClass(), "first", term974926);
        setField(term974786, term974786.getClass(), "first", term974856);
        setField(term974716, term974716.getClass(), "first", term974786);
        setField(term974646, term974646.getClass(), "first", term974716);
        setField(term974576, term974576.getClass(), "first", term974646);
        setField(term974506, term974506.getClass(), "first", term974576);
        setField(term974436, term974436.getClass(), "first", term974506);
        setField(term974366, term974366.getClass(), "first", term974436);
        setField(term974296, term974296.getClass(), "first", term974366);
        setField(term974226, term974226.getClass(), "first", term974296);
        setField(term974156, term974156.getClass(), "first", term974226);
        setField(term974086, term974086.getClass(), "first", term974156);
        setField(term974016, term974016.getClass(), "first", term974086);
        setField(term973946, term973946.getClass(), "first", term974016);
        setField(term973876, term973876.getClass(), "first", term973946);
        setField(term973806, term973806.getClass(), "first", term973876);
        setField(term973736, term973736.getClass(), "first", term973806);
        setField(term973666, term973666.getClass(), "first", term973736);
        setField(term973596, term973596.getClass(), "first", term973666);
        setField(term973526, term973526.getClass(), "first", term973596);
        setField(term973456, term973456.getClass(), "first", term973526);
        setField(term973386, term973386.getClass(), "first", term973456);
        setField(term973316, term973316.getClass(), "first", term973386);
        setField(term973246, term973246.getClass(), "first", term973316);
        setField(term973176, term973176.getClass(), "first", term973246);
        setField(term973106, term973106.getClass(), "first", term973176);
        setField(term973036, term973036.getClass(), "first", term973106);
        setField(term972966, term972966.getClass(), "first", term973036);
        setField(term972896, term972896.getClass(), "first", term972966);
        setField(term972826, term972826.getClass(), "first", term972896);
        setField(term972756, term972756.getClass(), "first", term972826);
        setField(term972686, term972686.getClass(), "first", term972756);
        setField(term972616, term972616.getClass(), "first", term972686);
        setField(term972546, term972546.getClass(), "first", term972616);
        setField(term972476, term972476.getClass(), "first", term972546);
        setField(term972406, term972406.getClass(), "first", term972476);
        setField(term972336, term972336.getClass(), "first", term972406);
        setField(term972266, term972266.getClass(), "first", term972336);
        setField(term972196, term972196.getClass(), "first", term972266);
        setField(term972126, term972126.getClass(), "first", term972196);
        setField(term972056, term972056.getClass(), "first", term972126);
        setField(term971986, term971986.getClass(), "first", term972056);
        setField(term971916, term971916.getClass(), "first", term971986);
        setField(term971846, term971846.getClass(), "first", term971916);
        setField(term971776, term971776.getClass(), "first", term971846);
        setField(term971706, term971706.getClass(), "first", term971776);
        setField(term971636, term971636.getClass(), "first", term971706);
        setField(term971566, term971566.getClass(), "first", term971636);
        setField(term971496, term971496.getClass(), "first", term971566);
        setField(term971426, term971426.getClass(), "first", term971496);
        setField(term971356, term971356.getClass(), "first", term971426);
        setField(term971286, term971286.getClass(), "first", term971356);
        setField(term971216, term971216.getClass(), "first", term971286);
        setField(term971146, term971146.getClass(), "first", term971216);
        setField(term971076, term971076.getClass(), "first", term971146);
        setField(term971006, term971006.getClass(), "first", term971076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term971006;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term970936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


