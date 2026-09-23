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
import java.nio.ReadOnlyBufferException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbstractCommandLineRunner_writeOutput_1967611700158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204106;

    public AbstractCommandLineRunner_writeOutput_1967611700158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204106 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204190 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204274 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204358 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204442 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204526 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204610 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204694 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204778 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204862 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term204946 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205030 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205114 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205198 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205282 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205366 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205450 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205534 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205618 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205702 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205786 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205870 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term205954 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206038 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206122 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206206 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206290 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206374 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206458 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206542 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206626 = newInstance(Class.forName("com.google.common.base.CharEscapers$1$1"));
        Object term206698 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferRB"));
        setField(term206626, term206626.getClass(), "val$out", term206698);
        setField(term206542, term206542.getClass(), "val$out", term206626);
        setField(term206458, term206458.getClass(), "val$out", term206542);
        setField(term206374, term206374.getClass(), "val$out", term206458);
        setField(term206290, term206290.getClass(), "val$out", term206374);
        setField(term206206, term206206.getClass(), "val$out", term206290);
        setField(term206122, term206122.getClass(), "val$out", term206206);
        setField(term206038, term206038.getClass(), "val$out", term206122);
        setField(term205954, term205954.getClass(), "val$out", term206038);
        setField(term205870, term205870.getClass(), "val$out", term205954);
        setField(term205786, term205786.getClass(), "val$out", term205870);
        setField(term205702, term205702.getClass(), "val$out", term205786);
        setField(term205618, term205618.getClass(), "val$out", term205702);
        setField(term205534, term205534.getClass(), "val$out", term205618);
        setField(term205450, term205450.getClass(), "val$out", term205534);
        setField(term205366, term205366.getClass(), "val$out", term205450);
        setField(term205282, term205282.getClass(), "val$out", term205366);
        setField(term205198, term205198.getClass(), "val$out", term205282);
        setField(term205114, term205114.getClass(), "val$out", term205198);
        setField(term205030, term205030.getClass(), "val$out", term205114);
        setField(term204946, term204946.getClass(), "val$out", term205030);
        setField(term204862, term204862.getClass(), "val$out", term204946);
        setField(term204778, term204778.getClass(), "val$out", term204862);
        setField(term204694, term204694.getClass(), "val$out", term204778);
        setField(term204610, term204610.getClass(), "val$out", term204694);
        setField(term204526, term204526.getClass(), "val$out", term204610);
        setField(term204442, term204442.getClass(), "val$out", term204526);
        setField(term204358, term204358.getClass(), "val$out", term204442);
        setField(term204274, term204274.getClass(), "val$out", term204358);
        setField(term204190, term204190.getClass(), "val$out", term204274);
        setField(term204106, term204106.getClass(), "val$out", term204190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term204106;
        args[1] = null;
        args[2] = "";
        args[3] = "";
        args[4] = "";
        try {
            callMethod(klass, "writeOutput", argTypes, null, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


