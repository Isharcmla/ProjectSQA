package org.mockito.exceptions;

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
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class Reporter_createTooManyInvocationsMessage_61487655375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12611;
     Object term12612;
     Object term12614;
     Object term12616;

    public Reporter_createTooManyInvocationsMessage_61487655375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12611 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term12612 = new Integer(-1922583790);
        term12614 = new Integer(-616727354);
        Class<? extends Object> term12686 = Class.forName((String) "org.mockito.exceptions.misusing.UnfinishedStubbingException");
        Class<? extends Object> term12688 = Class.forName((String) "org.mockito.asm.tree.VarInsnNode");
        Class<? extends Object> term12690 = Class.forName((String) "org.assertj.core.internal.cglib.core.LocalVariablesSorter");
        Class<? extends Object> term12692 = Class.forName((String) "org.mockito.cglib.beans.BulkBeanException");
        Class<? extends Object> term12694 = Class.forName((String) "org.hamcrest.Condition");
        Class<? extends Object> term12696 = Class.forName((String) "org.assertj.core.internal.cglib.asm.ClassVisitor");
        Class<? extends Object> term12698 = Class.forName((String) "org.mockito.cglib.transform.TransformingClassGenerator");
        Class<? extends Object> term12700 = Class.forName((String) "java.util.concurrent.Flow$Publisher");
        Class<? extends Object> term12702 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Class<? extends Object> term12704 = Class.forName((String) "java.util.concurrent.atomic.DoubleAccumulator$SerializationProxy");
        Class<? extends Object> term12706 = Class.forName((String) "kex.java.util.LinkedHashMap");
        Class<? extends Object> term12708 = Class.forName((String) "java.util.regex.Pattern$Ques");
        Class<? extends Object> term12710 = Class.forName((String) "org.mockito.ArgumentMatcher");
        Class<? extends Object> term12712 = Class.forName((String) "java.nio.file.WatchEvent$Modifier");
        Class<? extends Object> term12714 = Class.forName((String) "kex.java.lang.Float");
        Class<? extends Object> term12716 = Class.forName((String) "java.util.stream.MatchOps");
        Class<? extends Object> term12718 = Class.forName((String) "java.util.HashSet");
        term12616 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term12617 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term12618 = (Object[]) newArray("java.lang.Object", 5);
        short[] term12619 = (short[]) newShortArray(32);
        int[] term12652 = (int[]) newIntArray(32);
        Object[] term12685 = (Object[]) newArray("java.lang.Object", 32);
        long[] term12720 = (long[]) newLongArray(32);
        Object[] term12753 = (Object[]) newArray("java.lang.Object", 5);
        short[] term12754 = (short[]) newShortArray(32);
        int[] term12787 = (int[]) newIntArray(32);
        Object[] term12820 = (Object[]) newArray("java.lang.Object", 32);
        long[] term12821 = (long[]) newLongArray(32);
        Object[] term12854 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term12856 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term12858 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term12619, 0, (short) 1);
        setShortElement(term12619, 2, (short) 1);
        setShortElement(term12619, 3, (short) 2);
        setShortElement(term12619, 4, (short) 1);
        setShortElement(term12619, 5, (short) 7);
        setShortElement(term12619, 6, (short) 2);
        setShortElement(term12619, 7, (short) 1);
        setShortElement(term12619, 8, (short) 6);
        setShortElement(term12619, 9, (short) 2);
        setShortElement(term12619, 10, (short) 10);
        setShortElement(term12619, 11, (short) 11);
        setShortElement(term12619, 12, (short) 29);
        setShortElement(term12619, 13, (short) 5);
        setShortElement(term12619, 14, (short) 4);
        setShortElement(term12619, 15, (short) 4);
        setShortElement(term12619, 16, (short) 3);
        setShortElement(term12619, 17, (short) 5);
        setShortElement(term12619, 18, (short) 9);
        setShortElement(term12619, 19, (short) 10);
        setShortElement(term12619, 20, (short) 11);
        setShortElement(term12619, 21, (short) 4);
        setShortElement(term12619, 22, (short) 1);
        setShortElement(term12619, 24, (short) 10);
        setShortElement(term12619, 25, (short) 3);
        setShortElement(term12619, 26, (short) 4);
        setShortElement(term12619, 27, (short) 9);
        setShortElement(term12619, 28, (short) 1);
        setShortElement(term12619, 29, (short) 2);
        setShortElement(term12619, 30, (short) 3);
        setShortElement(term12619, 31, (short) 3);
        setElement(term12618, 0, term12619);
        setIntElement(term12652, 0, 917504);
        setIntElement(term12652, 1, 524288);
        setIntElement(term12652, 3, 5570560);
        setIntElement(term12652, 4, 327680);
        setIntElement(term12652, 5, 4456454);
        setIntElement(term12652, 6, 1769472);
        setIntElement(term12652, 7, 14876672);
        setIntElement(term12652, 8, 6225920);
        setIntElement(term12652, 9, 917504);
        setIntElement(term12652, 10, 327680);
        setIntElement(term12652, 11, 8519680);
        setIntElement(term12652, 12, 917504);
        setIntElement(term12652, 13, 11993088);
        setIntElement(term12652, 14, 655360);
        setIntElement(term12652, 15, 7864320);
        setIntElement(term12652, 16, 3735552);
        setIntElement(term12652, 17, 7143424);
        setIntElement(term12652, 18, 8454144);
        setIntElement(term12652, 19, 9240576);
        setIntElement(term12652, 20, 196608);
        setIntElement(term12652, 21, 3801088);
        setIntElement(term12652, 22, 786432);
        setIntElement(term12652, 23, 589824);
        setIntElement(term12652, 24, 17170432);
        setIntElement(term12652, 25, 1376256);
        setIntElement(term12652, 26, 5242880);
        setIntElement(term12652, 27, 2883584);
        setIntElement(term12652, 28, 20774912);
        setIntElement(term12652, 29, 262144);
        setIntElement(term12652, 30, 2555904);
        setIntElement(term12652, 31, 1835008);
        setElement(term12618, 1, term12652);
        setElement(term12685, 0, term12686);
        setElement(term12685, 1, term12686);
        setElement(term12685, 2, term12688);
        setElement(term12685, 3, term12688);
        setElement(term12685, 4, term12690);
        setElement(term12685, 5, term12692);
        setElement(term12685, 6, term12694);
        setElement(term12685, 7, term12694);
        setElement(term12685, 8, term12696);
        setElement(term12685, 9, term12696);
        setElement(term12685, 10, term12698);
        setElement(term12685, 11, term12698);
        setElement(term12685, 12, term12698);
        setElement(term12685, 13, term12698);
        setElement(term12685, 14, term12698);
        setElement(term12685, 15, term12700);
        setElement(term12685, 16, term12700);
        setElement(term12685, 17, term12702);
        setElement(term12685, 18, term12702);
        setElement(term12685, 19, term12702);
        setElement(term12685, 20, term12702);
        setElement(term12685, 21, term12704);
        setElement(term12685, 22, term12704);
        setElement(term12685, 23, term12704);
        setElement(term12685, 24, term12706);
        setElement(term12685, 25, term12702);
        setElement(term12685, 26, term12708);
        setElement(term12685, 27, term12710);
        setElement(term12685, 28, term12712);
        setElement(term12685, 29, term12714);
        setElement(term12685, 30, term12716);
        setElement(term12685, 31, term12718);
        setElement(term12618, 2, term12685);
        setLongElement(term12720, 0, 34363745304L);
        setLongElement(term12720, 1, 34363745304L);
        setLongElement(term12720, 2, 34363746224L);
        setLongElement(term12720, 3, 34363775512L);
        setLongElement(term12720, 4, 34363775512L);
        setLongElement(term12720, 5, 34363775512L);
        setLongElement(term12720, 6, 128809362246416L);
        setLongElement(term12720, 7, 34364440080L);
        setLongElement(term12720, 8, 128809362321008L);
        setLongElement(term12720, 9, 128809362085936L);
        setLongElement(term12720, 10, 128809362085824L);
        setLongElement(term12720, 11, 128809362085968L);
        setLongElement(term12720, 12, 128809362207296L);
        setLongElement(term12720, 13, 34363766248L);
        setLongElement(term12720, 14, 34363766248L);
        setLongElement(term12720, 15, 128806364538672L);
        setLongElement(term12720, 16, 128806364538672L);
        setLongElement(term12720, 17, 128806364538528L);
        setLongElement(term12720, 18, 128806364549760L);
        setLongElement(term12720, 19, 128806364551280L);
        setLongElement(term12720, 20, 128806364552048L);
        setLongElement(term12720, 21, 128806361950816L);
        setLongElement(term12720, 22, 34363739368L);
        setLongElement(term12720, 23, 34363739368L);
        setLongElement(term12720, 24, 128806364546688L);
        setLongElement(term12720, 25, 34363829248L);
        setLongElement(term12720, 26, 128806361950816L);
        setLongElement(term12720, 27, 128809410801520L);
        setLongElement(term12720, 28, 34363745472L);
        setLongElement(term12720, 29, 34364710216L);
        setLongElement(term12720, 30, 34363745472L);
        setLongElement(term12720, 31, 34363745472L);
        setElement(term12618, 3, term12720);
        setShortElement(term12754, 0, (short) 13);
        setShortElement(term12754, 1, (short) 1);
        setShortElement(term12754, 2, (short) 2);
        setShortElement(term12754, 3, (short) 12);
        setElement(term12753, 0, term12754);
        setIntElement(term12787, 0, 6029312);
        setIntElement(term12787, 1, 327680);
        setIntElement(term12787, 2, 1638400);
        setIntElement(term12787, 3, 720907);
        setElement(term12753, 1, term12787);
        setElement(term12753, 2, term12820);
        setLongElement(term12821, 0, 34364896224L);
        setLongElement(term12821, 1, 34363745472L);
        setLongElement(term12821, 2, 34363745472L);
        setLongElement(term12821, 3, 34363745472L);
        setElement(term12753, 3, term12821);
        setElement(term12618, 4, term12753);
        setField(term12617, term12617.getClass(), "backtrace", term12618);
        setField(term12617, term12617.getClass(), "detailMessage", null);
        setField(term12617, term12617.getClass(), "cause", term12617);
        setField(term12617, term12617.getClass(), "stackTrace", term12854);
        setIntField(term12617, term12617.getClass(), "depth", 36);
        setIntField(term12856, term12856.getClass(), "modCount", 0);
        setField(term12617, term12617.getClass(), "suppressedExceptions", term12856);
        setField(term12616, term12616.getClass(), "stackTraceHolder", term12617);
        setField(term12616, term12616.getClass(), "stackTraceFilter", term12858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[3] = Class.forName("org.mockito.internal.debugging.Location");
        Object[] args = new Object[4];
        args[0] = term12612;
        args[1] = term12614;
        args[2] = null;
        args[3] = term12616;
        try {
            callMethod(klass, "createTooManyInvocationsMessage", argTypes, term12611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


