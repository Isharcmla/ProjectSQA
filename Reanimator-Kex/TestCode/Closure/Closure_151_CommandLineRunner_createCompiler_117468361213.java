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
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class CommandLineRunner_createCompiler_117468361213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4778;

    public CommandLineRunner_createCompiler_117468361213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24455 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term24454 = ((Class) term24455).getDeclaredField((String) "OFF");
        ((Field) term24454).setAccessible(true);
        Object enum51 = ((Field) term24454).get((Object) null);
        ArrayList term4801 = new ArrayList();
        ArrayList term4805 = new ArrayList();
        ArrayList term4811 = new ArrayList();
        ArrayList term4838 = new ArrayList();
        ArrayList term4848 = new ArrayList();
        ArrayList term4852 = new ArrayList();
        ArrayList term4856 = new ArrayList();
        ArrayList term4860 = new ArrayList();
        Class<? extends Object> term24748 = Class.forName((String) "com.google.javascript.jscomp.CompilationLevel");
        Field term24747 = ((Class) term24748).getDeclaredField((String) "SIMPLE_OPTIMIZATIONS");
        ((Field) term24747).setAccessible(true);
        Object enum52 = ((Field) term24747).get((Object) null);
        Class<? extends Object> term25040 = Class.forName((String) "com.google.javascript.jscomp.WarningLevel");
        Field term25039 = ((Class) term25040).getDeclaredField((String) "DEFAULT");
        ((Field) term25039).setAccessible(true);
        Object enum53 = ((Field) term25039).get((Object) null);
        ArrayList term4903 = new ArrayList();
        ArrayList term4926 = new ArrayList();
        ArrayList term4930 = new ArrayList();
        ArrayList term4936 = new ArrayList();
        ArrayList term4955 = new ArrayList();
        Class<? extends Object> term25280 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term25279 = ((Class) term25280).getDeclaredField((String) "ALL");
        ((Field) term25279).setAccessible(true);
        Object enum54 = ((Field) term25279).get((Object) null);
        Class<? extends Object> term25546 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$Format");
        Field term25545 = ((Class) term25546).getDeclaredField((String) "LEGACY");
        ((Field) term25545).setAccessible(true);
        Object enum55 = ((Field) term25545).get((Object) null);
        ArrayList term4980 = new ArrayList();
        ArrayList term4984 = new ArrayList();
        ArrayList term4988 = new ArrayList();
        ArrayList term4992 = new ArrayList();
        ArrayList term5079 = new ArrayList();
        term4778 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term4779 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term4912 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        Object term4949 = newInstance(Class.forName("com.google.javascript.jscomp.DefaultCodingConvention"));
        Object term5001 = newInstance(Class.forName("java.io.PrintStream"));
        Object term5004 = newInstance(Class.forName("java.util.Formatter"));
        Object term5005 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5006 = (byte[]) newByteArray(16);
        Object term5025 = newInstance(Class.forName("java.util.Locale"));
        Object term5026 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term5030 = newInstance(Class.forName("java.io.IOException"));
        Object[] term5031 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term5033 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term5035 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5038 = newInstance(Class.forName("java.io.BufferedWriter"));
        char[] term5039 = (char[]) newCharArray(2);
        char[] term5044 = (char[]) newCharArray(1);
        Object term5046 = newInstance(Class.forName("java.lang.Object"));
        Object term5047 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        char[] term5048 = (char[]) newCharArray(9);
        Object term5058 = newInstance(Class.forName("java.lang.Object"));
        Object term5061 = newInstance(Class.forName("java.lang.Object"));
        Object term5075 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats"));
        setBooleanField(term4779, term4779.getClass(), "display_help", false);
        setBooleanField(term4779, term4779.getClass(), "print_tree", true);
        setBooleanField(term4779, term4779.getClass(), "compute_phase_ordering", false);
        setBooleanField(term4779, term4779.getClass(), "print_ast", false);
        setBooleanField(term4779, term4779.getClass(), "print_pass_graph", false);
        setField(term4779, term4779.getClass(), "jscomp_dev_mode", enum51);
        setField(term4779, term4779.getClass(), "logging_level", "WARNING");
        setField(term4779, term4779.getClass(), "externs", term4801);
        setField(term4779, term4779.getClass(), "js", term4805);
        setField(term4779, term4779.getClass(), "js_output_file", "");
        setField(term4779, term4779.getClass(), "module", term4811);
        setField(term4779, term4779.getClass(), "variable_map_input_file", "");
        setField(term4779, term4779.getClass(), "property_map_input_file", "");
        setField(term4779, term4779.getClass(), "variable_map_output_file", "");
        setBooleanField(term4779, term4779.getClass(), "create_name_map_files", false);
        setField(term4779, term4779.getClass(), "property_map_output_file", "");
        setBooleanField(term4779, term4779.getClass(), "third_party", true);
        setIntField(term4779, term4779.getClass(), "summary_detail_level", 1);
        setField(term4779, term4779.getClass(), "output_wrapper", "");
        setField(term4779, term4779.getClass(), "output_wrapper_marker", "%output%");
        setField(term4779, term4779.getClass(), "module_wrapper", term4838);
        setField(term4779, term4779.getClass(), "module_output_path_prefix", "./");
        setField(term4779, term4779.getClass(), "create_source_map", "");
        setField(term4779, term4779.getClass(), "jscomp_error", term4848);
        setField(term4779, term4779.getClass(), "jscomp_warning", term4852);
        setField(term4779, term4779.getClass(), "jscomp_off", term4856);
        setField(term4779, term4779.getClass(), "define", term4860);
        setField(term4779, term4779.getClass(), "charset", "");
        setField(term4779, term4779.getClass(), "compilation_level", enum52);
        setField(term4779, term4779.getClass(), "warning_level", enum53);
        setBooleanField(term4779, term4779.getClass(), "use_only_custom_externs", true);
        setBooleanField(term4779, term4779.getClass(), "debug", false);
        setField(term4779, term4779.getClass(), "formatting", term4903);
        setBooleanField(term4779, term4779.getClass(), "process_closure_primitives", true);
        setBooleanField(term4779, term4779.getClass(), "manage_closure_dependencies", false);
        setField(term4779, term4779.getClass(), "output_manifest", "");
        setField(term4778, term4778.getClass(), "flags", term4779);
        setBooleanField(term4778, term4778.getClass(), "isConfigValid", true);
        setBooleanField(term4912, term4912.getClass(), "printTree", true);
        setBooleanField(term4912, term4912.getClass(), "computePhaseOrdering", true);
        setBooleanField(term4912, term4912.getClass(), "printAst", false);
        setBooleanField(term4912, term4912.getClass(), "printPassGraph", false);
        setField(term4912, term4912.getClass(), "jscompDevMode", enum51);
        setField(term4912, term4912.getClass(), "loggingLevel", "WARNING");
        setField(term4912, term4912.getClass(), "externs", term4926);
        setField(term4912, term4912.getClass(), "js", term4930);
        setField(term4912, term4912.getClass(), "jsOutputFile", "");
        setField(term4912, term4912.getClass(), "module", term4936);
        setField(term4912, term4912.getClass(), "variableMapInputFile", "");
        setField(term4912, term4912.getClass(), "propertyMapInputFile", "");
        setField(term4912, term4912.getClass(), "variableMapOutputFile", "");
        setBooleanField(term4912, term4912.getClass(), "createNameMapFiles", false);
        setField(term4912, term4912.getClass(), "propertyMapOutputFile", "");
        setField(term4912, term4912.getClass(), "codingConvention", term4949);
        setIntField(term4912, term4912.getClass(), "summaryDetailLevel", 1);
        setField(term4912, term4912.getClass(), "outputWrapper", "");
        setField(term4912, term4912.getClass(), "outputWrapperMarker", "");
        setField(term4912, term4912.getClass(), "moduleWrapper", term4955);
        setField(term4912, term4912.getClass(), "moduleOutputPathPrefix", "");
        setField(term4912, term4912.getClass(), "createSourceMap", "");
        setField(term4912, term4912.getClass(), "sourceMapDetailLevel", enum54);
        setField(term4912, term4912.getClass(), "sourceMapFormat", enum55);
        setField(term4912, term4912.getClass(), "jscompError", term4980);
        setField(term4912, term4912.getClass(), "jscompWarning", term4984);
        setField(term4912, term4912.getClass(), "jscompOff", term4988);
        setField(term4912, term4912.getClass(), "define", term4992);
        setField(term4912, term4912.getClass(), "charset", "");
        setBooleanField(term4912, term4912.getClass(), "manageClosureDependencies", false);
        setField(term4912, term4912.getClass(), "outputManifest", "");
        setField(term4778, term4778.getClass(), "config", term4912);
        setField(term4778, term4778.getClass(), "out", null);
        setBooleanField(term5001, term5001.getClass(), "autoFlush", false);
        setBooleanField(term5001, term5001.getClass(), "trouble", false);
        setField(term5005, term5005.getClass(), "value", term5006);
        setByteField(term5005, term5005.getClass(), "coder", (byte) 0);
        setIntField(term5005, term5005.getClass(), "count", 0);
        setField(term5004, term5004.getClass(), "a", term5005);
        setField(term5026, term5026.getClass(), "language", null);
        setField(term5026, term5026.getClass(), "script", null);
        setField(term5026, term5026.getClass(), "region", null);
        setField(term5026, term5026.getClass(), "variant", null);
        setIntField(term5026, term5026.getClass(), "hash", 96636889);
        setField(term5025, term5025.getClass(), "baseLocale", term5026);
        setField(term5025, term5025.getClass(), "localeExtensions", null);
        setIntField(term5025, term5025.getClass(), "hashCodeValue", 96636889);
        setField(term5025, term5025.getClass(), "languageTag", "");
        setField(term5004, term5004.getClass(), "l", term5025);
        setField(term5030, term5030.getClass(), "backtrace", term5031);
        setField(term5030, term5030.getClass(), "detailMessage", "");
        setField(term5030, term5030.getClass(), "cause", term5030);
        setField(term5030, term5030.getClass(), "stackTrace", term5033);
        setIntField(term5030, term5030.getClass(), "depth", 49);
        setIntField(term5035, term5035.getClass(), "modCount", 0);
        setField(term5030, term5030.getClass(), "suppressedExceptions", term5035);
        setField(term5004, term5004.getClass(), "lastException", term5030);
        setCharField(term5004, term5004.getClass(), "zero", (char) 48);
        setField(term5001, term5001.getClass(), "formatter", term5004);
        setField(term5038, term5038.getClass(), "out", null);
        setCharElement(term5039, 0, 't');
        setCharElement(term5039, 1, 'D');
        setField(term5038, term5038.getClass(), "cb", term5039);
        setIntField(term5038, term5038.getClass(), "nChars", 1725571209);
        setIntField(term5038, term5038.getClass(), "nextChar", -522618178);
        setCharElement(term5044, 0, 'I');
        setField(term5038, term5038.getClass(), "writeBuffer", term5044);
        setField(term5038, term5038.getClass(), "lock", term5046);
        setField(term5001, term5001.getClass(), "textOut", term5038);
        setField(term5047, term5047.getClass(), "se", null);
        setCharElement(term5048, 0, 'R');
        setCharElement(term5048, 1, 'b');
        setCharElement(term5048, 2, 'S');
        setCharElement(term5048, 3, 'S');
        setCharElement(term5048, 4, 'b');
        setCharElement(term5048, 5, 'S');
        setCharElement(term5048, 6, 'z');
        setCharElement(term5048, 7, 'j');
        setCharElement(term5048, 8, 'V');
        setField(term5047, term5047.getClass(), "writeBuffer", term5048);
        setField(term5047, term5047.getClass(), "lock", term5058);
        setField(term5001, term5001.getClass(), "charOut", term5047);
        setBooleanField(term5001, term5001.getClass(), "closing", false);
        setField(term5001, term5001.getClass(), "out", null);
        setBooleanField(term5001, term5001.getClass(), "closed", true);
        setField(term5001, term5001.getClass(), "closeLock", term5061);
        setField(term4778, term4778.getClass(), "err", term5001);
        setField(term4778, term4778.getClass(), "compiler", null);
        setField(term4778, term4778.getClass(), "inputCharset", null);
        setField(term4778, term4778.getClass(), "outputCharset", "xOEqzGAmDU");
        setBooleanField(term4778, term4778.getClass(), "testMode", false);
        setField(term4778, term4778.getClass(), "externsSupplierForTesting", null);
        setField(term4778, term4778.getClass(), "inputsSupplierForTesting", null);
        setField(term4778, term4778.getClass(), "modulesSupplierForTesting", null);
        setField(term4778, term4778.getClass(), "exitCodeReceiverForTesting", null);
        setLongField(term5075, term5075.getClass(), "bestRunTime", 4872422362414183754L);
        setLongField(term5075, term5075.getClass(), "worstRunTime", 6811161968424632369L);
        setLongField(term5075, term5075.getClass(), "lastStartTime", -7237588299778557629L);
        setField(term5075, term5075.getClass(), "loopedPassesInBestRun", term5079);
        setField(term5075, term5075.getClass(), "this$0", null);
        setField(term4778, term4778.getClass(), "runTimeStats", term5075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createCompiler", argTypes, term4778, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};


