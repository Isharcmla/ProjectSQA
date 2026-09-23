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

public class Reporter_tooManyActualInvocationsInOrder_158719675077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17848;
     Object term17849;
     Object term17851;
     Object term17853;

    public Reporter_tooManyActualInvocationsInOrder_158719675077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17848 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term17849 = new Integer(-1955890973);
        term17851 = new Integer(-2038273078);
        Class<? extends Object> term17923 = Class.forName((String) "org.hamcrest.generator.qdox.model.JavaMethod");
        Class<? extends Object> term17925 = Class.forName((String) "java.util.LinkedList$ListItr");
        Class<? extends Object> term17927 = Class.forName((String) "net.sourceforge.cobertura.javancss.parser.java15.debug.JavaParser15DebugTokenManager");
        Class<? extends Object> term17929 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferB");
        Class<? extends Object> term17931 = Class.forName((String) "org.objectweb.asm.util.TraceAnnotationVisitor");
        Class<? extends Object> term17933 = Class.forName((String) "org.objectweb.asm.xml.Processor$ZipEntryElement");
        Class<? extends Object> term17935 = Class.forName((String) "org.assertj.core.error.ShouldBeInSameSecondWindow");
        Class<? extends Object> term17937 = Class.forName((String) "java.lang.FdLibm$Cbrt");
        Class<? extends Object> term17939 = Class.forName((String) "java.util.zip.ZipOutputStream");
        Class<? extends Object> term17941 = Class.forName((String) "org.assertj.core.api.UriAssert");
        Class<? extends Object> term17943 = Class.forName((String) "org.assertj.core.internal.cglib.core.EmitUtils$4");
        Class<? extends Object> term17945 = Class.forName((String) "java.nio.HeapFloatBufferR");
        Class<? extends Object> term17947 = Class.forName((String) "org.assertj.core.error.uri.ShouldHavePort");
        Class<? extends Object> term17949 = Class.forName((String) "java.util.EnumSet");
        Class<? extends Object> term17951 = Class.forName((String) "java.util.jar.JarException");
        Class<? extends Object> term17953 = Class.forName((String) "org.objectweb.asm.Label");
        Class<? extends Object> term17955 = Class.forName((String) "org.mockito.internal.configuration.injection.NameBasedCandidateFilter");
        term17853 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term17854 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term17855 = (Object[]) newArray("java.lang.Object", 5);
        short[] term17856 = (short[]) newShortArray(32);
        int[] term17889 = (int[]) newIntArray(32);
        Object[] term17922 = (Object[]) newArray("java.lang.Object", 32);
        long[] term17957 = (long[]) newLongArray(32);
        Object[] term17990 = (Object[]) newArray("java.lang.Object", 5);
        short[] term17991 = (short[]) newShortArray(32);
        int[] term18024 = (int[]) newIntArray(32);
        Object[] term18057 = (Object[]) newArray("java.lang.Object", 32);
        long[] term18058 = (long[]) newLongArray(32);
        Object[] term18091 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term18093 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term18095 = newInstance(Class.forName("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setShortElement(term17856, 0, (short) 1);
        setShortElement(term17856, 2, (short) 1);
        setShortElement(term17856, 3, (short) 2);
        setShortElement(term17856, 4, (short) 1);
        setShortElement(term17856, 5, (short) 7);
        setShortElement(term17856, 6, (short) 2);
        setShortElement(term17856, 7, (short) 1);
        setShortElement(term17856, 8, (short) 6);
        setShortElement(term17856, 9, (short) 2);
        setShortElement(term17856, 10, (short) 10);
        setShortElement(term17856, 11, (short) 11);
        setShortElement(term17856, 12, (short) 29);
        setShortElement(term17856, 13, (short) 5);
        setShortElement(term17856, 14, (short) 4);
        setShortElement(term17856, 15, (short) 4);
        setShortElement(term17856, 16, (short) 3);
        setShortElement(term17856, 17, (short) 5);
        setShortElement(term17856, 18, (short) 9);
        setShortElement(term17856, 19, (short) 10);
        setShortElement(term17856, 20, (short) 11);
        setShortElement(term17856, 21, (short) 4);
        setShortElement(term17856, 22, (short) 1);
        setShortElement(term17856, 24, (short) 10);
        setShortElement(term17856, 25, (short) 3);
        setShortElement(term17856, 26, (short) 4);
        setShortElement(term17856, 27, (short) 9);
        setShortElement(term17856, 28, (short) 1);
        setShortElement(term17856, 29, (short) 2);
        setShortElement(term17856, 30, (short) 3);
        setShortElement(term17856, 31, (short) 3);
        setElement(term17855, 0, term17856);
        setIntElement(term17889, 0, 917504);
        setIntElement(term17889, 1, 524288);
        setIntElement(term17889, 3, 5570560);
        setIntElement(term17889, 4, 327680);
        setIntElement(term17889, 5, 4456454);
        setIntElement(term17889, 6, 1769472);
        setIntElement(term17889, 7, 14876672);
        setIntElement(term17889, 8, 6225920);
        setIntElement(term17889, 9, 917504);
        setIntElement(term17889, 10, 327680);
        setIntElement(term17889, 11, 8519680);
        setIntElement(term17889, 12, 917504);
        setIntElement(term17889, 13, 11993088);
        setIntElement(term17889, 14, 655360);
        setIntElement(term17889, 15, 7864320);
        setIntElement(term17889, 16, 3735552);
        setIntElement(term17889, 17, 7143424);
        setIntElement(term17889, 18, 8454144);
        setIntElement(term17889, 19, 9240576);
        setIntElement(term17889, 20, 196608);
        setIntElement(term17889, 21, 3801088);
        setIntElement(term17889, 22, 786432);
        setIntElement(term17889, 23, 589824);
        setIntElement(term17889, 24, 17170432);
        setIntElement(term17889, 25, 1376256);
        setIntElement(term17889, 26, 5242880);
        setIntElement(term17889, 27, 2883584);
        setIntElement(term17889, 28, 20774912);
        setIntElement(term17889, 29, 262144);
        setIntElement(term17889, 30, 2555904);
        setIntElement(term17889, 31, 1835008);
        setElement(term17855, 1, term17889);
        setElement(term17922, 0, term17923);
        setElement(term17922, 1, term17923);
        setElement(term17922, 2, term17925);
        setElement(term17922, 3, term17925);
        setElement(term17922, 4, term17927);
        setElement(term17922, 5, term17929);
        setElement(term17922, 6, term17931);
        setElement(term17922, 7, term17931);
        setElement(term17922, 8, term17933);
        setElement(term17922, 9, term17933);
        setElement(term17922, 10, term17935);
        setElement(term17922, 11, term17935);
        setElement(term17922, 12, term17935);
        setElement(term17922, 13, term17935);
        setElement(term17922, 14, term17935);
        setElement(term17922, 15, term17937);
        setElement(term17922, 16, term17937);
        setElement(term17922, 17, term17939);
        setElement(term17922, 18, term17939);
        setElement(term17922, 19, term17939);
        setElement(term17922, 20, term17939);
        setElement(term17922, 21, term17941);
        setElement(term17922, 22, term17941);
        setElement(term17922, 23, term17941);
        setElement(term17922, 24, term17943);
        setElement(term17922, 25, term17939);
        setElement(term17922, 26, term17945);
        setElement(term17922, 27, term17947);
        setElement(term17922, 28, term17949);
        setElement(term17922, 29, term17951);
        setElement(term17922, 30, term17953);
        setElement(term17922, 31, term17955);
        setElement(term17855, 2, term17922);
        setLongElement(term17957, 0, 34363745304L);
        setLongElement(term17957, 1, 34363745304L);
        setLongElement(term17957, 2, 34363746224L);
        setLongElement(term17957, 3, 34363775512L);
        setLongElement(term17957, 4, 34363775512L);
        setLongElement(term17957, 5, 34363775512L);
        setLongElement(term17957, 6, 128809362246416L);
        setLongElement(term17957, 7, 34364440080L);
        setLongElement(term17957, 8, 128809362321008L);
        setLongElement(term17957, 9, 128809362085936L);
        setLongElement(term17957, 10, 128809362085824L);
        setLongElement(term17957, 11, 128809362085968L);
        setLongElement(term17957, 12, 128809362207296L);
        setLongElement(term17957, 13, 34363766248L);
        setLongElement(term17957, 14, 34363766248L);
        setLongElement(term17957, 15, 128806364538672L);
        setLongElement(term17957, 16, 128806364538672L);
        setLongElement(term17957, 17, 128806364538528L);
        setLongElement(term17957, 18, 128806364549760L);
        setLongElement(term17957, 19, 128806364551280L);
        setLongElement(term17957, 20, 128806364552048L);
        setLongElement(term17957, 21, 128806361950816L);
        setLongElement(term17957, 22, 34363739368L);
        setLongElement(term17957, 23, 34363739368L);
        setLongElement(term17957, 24, 128806364546688L);
        setLongElement(term17957, 25, 34363829248L);
        setLongElement(term17957, 26, 128806361950816L);
        setLongElement(term17957, 27, 128809410801520L);
        setLongElement(term17957, 28, 34363745472L);
        setLongElement(term17957, 29, 34364710216L);
        setLongElement(term17957, 30, 34363745472L);
        setLongElement(term17957, 31, 34363745472L);
        setElement(term17855, 3, term17957);
        setShortElement(term17991, 0, (short) 13);
        setShortElement(term17991, 1, (short) 1);
        setShortElement(term17991, 2, (short) 2);
        setShortElement(term17991, 3, (short) 12);
        setElement(term17990, 0, term17991);
        setIntElement(term18024, 0, 6029312);
        setIntElement(term18024, 1, 327680);
        setIntElement(term18024, 2, 1638400);
        setIntElement(term18024, 3, 720907);
        setElement(term17990, 1, term18024);
        setElement(term17990, 2, term18057);
        setLongElement(term18058, 0, 34364896224L);
        setLongElement(term18058, 1, 34363745472L);
        setLongElement(term18058, 2, 34363745472L);
        setLongElement(term18058, 3, 34363745472L);
        setElement(term17990, 3, term18058);
        setElement(term17855, 4, term17990);
        setField(term17854, term17854.getClass(), "backtrace", term17855);
        setField(term17854, term17854.getClass(), "detailMessage", null);
        setField(term17854, term17854.getClass(), "cause", term17854);
        setField(term17854, term17854.getClass(), "stackTrace", term18091);
        setIntField(term17854, term17854.getClass(), "depth", 36);
        setIntField(term18093, term18093.getClass(), "modCount", 0);
        setField(term17854, term17854.getClass(), "suppressedExceptions", term18093);
        setField(term17853, term17853.getClass(), "stackTraceHolder", term17854);
        setField(term17853, term17853.getClass(), "stackTraceFilter", term18095);
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
        args[0] = term17849;
        args[1] = term17851;
        args[2] = null;
        args[3] = term17853;
        try {
            callMethod(klass, "tooManyActualInvocationsInOrder", argTypes, term17848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


